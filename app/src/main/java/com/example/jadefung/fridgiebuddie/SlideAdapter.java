package com.example.jadefung.fridgiebuddie;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //list of images
    public int[] first_image = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3
    };
    // list of titles
    public String[] first_title = {
            "Ideas",
            "Reminder",
            "Organize"
    };
    //list of description
    public String[] first_description = {
            "Don't know what to eat? We are here to help!",
            "Remind you when your food will expire ",
            "Keep track of your food on your fingertip"
    };

    public SlideAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return first_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView)view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundResource( R.drawable.wichack2);
        imgslide.setImageResource(first_image[position]);
        txttitle.setText(first_title[position]);
        description.setText(first_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((LinearLayout)object);
    }
}
