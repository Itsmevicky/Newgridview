package com.example.newgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GridAdaptor extends AppCompatActivity {
    private int iv1[];
    private String tv1[];
    private Context context;
    private LayoutInflater inflater;
    public GridAdaptor(Context context,int iv1[],String tvi[]){
        this.context=context;
        this.iv1=iv1;
        this.tv1=tv1;
    }

public int getCount(){return tv1.length;}


    public Object getItem(int position) {return tv1[position];}


    public long getItemId(int position){return position;}

    public View getView(int position, View convertView, ViewGroup parent){
        View gridView=convertView;
        if(convertView==null) {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout, null);
        }
        ImageView iv=(ImageView)gridView.findViewById(R.id.iv1);
        TextView tv=(TextView)gridView.findViewById(R.id.tv1);
        iv.setImageResource(iv1[position]);
        tv.setText(tv1[position]);
        return gridView;
    }

}
