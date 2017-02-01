package com.vikram.clorikinternshipassignmentvikramsingh;

import android.content.Context;

/**
 * Created by rudranildas on 01/02/17.
 */

public  class Data {

    static  Integer[] getPic(Context c)
    {
        Integer[] pic={
                c.getResources().getIdentifier("a","drawable",c.getPackageName()),
                c.getResources().getIdentifier("b","drawable",c.getPackageName()),
                c.getResources().getIdentifier("white","drawable",c.getPackageName()),
                c.getResources().getIdentifier("white","drawable",c.getPackageName()),
                c.getResources().getIdentifier("white","drawable",c.getPackageName()),
                c.getResources().getIdentifier("rounded_corners","drawable",c.getPackageName())

        };
        return pic;
    }

    static String[] getText()
    {
        String[] txt={
               "User1","User2","Content1","Content2","Choice1","Content3"};
return txt;
    }
    static String[] getText2()
    {
        String[] txt={
                "","","","","","Choice Subtitle"};
        return txt;
    }
    static  Integer[] getButtonPic(Context c)
    {

        Integer[] pic={
                c.getResources().getIdentifier("add","drawable",c.getPackageName()),
                c.getResources().getIdentifier("add","drawable",c.getPackageName()),
                c.getResources().getIdentifier("send","drawable",c.getPackageName()),
                c.getResources().getIdentifier("send","drawable",c.getPackageName()),
                c.getResources().getIdentifier("copy","drawable",c.getPackageName()),
                c.getResources().getIdentifier("send","drawable",c.getPackageName())

        };
        return pic;
    }
}
