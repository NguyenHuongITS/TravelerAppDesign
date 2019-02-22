package com.example.nguyenhuongit.travelerappdesign.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.nguyenhuongit.travelerappdesign.R;


public class RecentAdapter extends BaseAdapter {
    public int[] recentList;
    public LayoutInflater layoutInflater;
    public Context context;

    public RecentAdapter(Context context, int[] recentList){
        this.context = context;
        this.recentList = recentList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return recentList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout_custom_gridview, null); // inflate the layout
        ImageView icon = (ImageView) convertView.findViewById(R.id.image_custom_gridview); // get the reference of ImageView
        icon.setImageResource(recentList[position]); // set logo images
        return convertView;
    }
}
