package com.example.projectx;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    private final String[] info ;
    public CustomList(Activity context,
                      String[] web,String[] info, Integer[] imageId) {
        super(context, R.layout.list_item, web);
        this.context = context;
        this.web = web;
        this.info = info;
        this.imageId = imageId;

    }
    @NotNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView= inflater.inflate(R.layout.list_item, null, true);

        TextView txtTitle = rowView.findViewById(R.id.txt);
        TextView txtinfo = rowView.findViewById(R.id.infoText);
        ImageView imageView = rowView.findViewById(R.id.img);

        txtTitle.setText(web[position]);
        txtinfo.setText(web[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}