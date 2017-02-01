package com.vikram.clorikinternshipassignmentvikramsingh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;
    ImageView image1;
    TextView tv1;
    RecyclerView recyclerView;
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(ImageView)findViewById(R.id.image1);
        tv1=(TextView)findViewById(R.id.textView1);

        tabHost=(TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();
        TabHost.TabSpec tab_one=tabHost.newTabSpec("TAB ONE");

        tab_one.setContent(R.id.tab1);
        tab_one.setIndicator("TAB ONE");
        tabHost.addTab(tab_one);

        TabHost.TabSpec tab_two=tabHost.newTabSpec("TAB TWO");
        tab_two.setContent(R.id.tab2);
        tab_two.setIndicator("TAB TWO");
        tabHost.addTab(tab_two);

        new AsyncgetImage().execute();

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyRecyclerViewAdapter
                (MainActivity.this,Data.getPic(getApplicationContext()),Data.getText(),Data.getText2(),Data.getButtonPic(getApplicationContext()));
        recyclerView.setAdapter(adapter);



    }
    private class AsyncgetImage extends AsyncTask<String,Void,Bitmap>
    {

        @Override
        protected Bitmap doInBackground(String... params) {
            Bitmap bmp=null;
            try
            {
                URL url=new URL(getResources().getString(R.string.URLAddress));
               // Log.e("Image",url.getFile());
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                InputStream inputStream=httpURLConnection.getInputStream();
                bmp= BitmapFactory.decodeStream(inputStream);


            }
            catch (Exception e){e.printStackTrace();}
            return bmp;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
           image1.setImageBitmap(bitmap);
            tv1.setText(getResources().getString(R.string.url)+" "+getResources().getString(R.string.URLAddress));
        }
    }
}
