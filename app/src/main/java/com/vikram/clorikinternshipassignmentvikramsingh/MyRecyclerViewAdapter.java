package com.vikram.clorikinternshipassignmentvikramsingh;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rudranildas on 01/02/17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.CustomViewHolder> {

    private Integer[] img;
    private String[] txt;
    private String[] txt2;
    private Integer[] imgB;

    MyRecyclerViewAdapter(Context context,Integer[] image,String[] text,String[] text2,Integer[] imageB)
    {
        img=image;
        txt=text;
        imgB=imageB;
        txt2=text2;

    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_list,null);
        CustomViewHolder viewHolder=new CustomViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.pic.setImageResource(img[position]);
        holder.str.setText(txt[position]);
        holder.str2.setText(txt2[position]);
        holder.button.setImageResource(imgB[position]);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        ImageView pic;
        TextView str,str2;
        ImageButton button;

        CustomViewHolder(View view)
        {
            super(view);
            pic=(ImageView)view.findViewById(R.id.ImagePic);
            str=(TextView)view.findViewById(R.id.mess1);
            str2=(TextView)view.findViewById(R.id.mess2);
            button=(ImageButton)view.findViewById(R.id.imageButton1);
        }
    }

    @Override
    public int getItemCount() {
        return txt.length;
    }


}
