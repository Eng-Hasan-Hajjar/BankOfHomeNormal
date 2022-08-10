package com.example.hasansafwanhajjar.bankofhomenormal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hasan Safwan Hajjar on 04/29/2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    Context context;
    int resource ;
    public ItemAdapter(Context context, int resource, ArrayList<Item> objects) {
        super(context, resource,  objects);
        this.context=context;
        this.resource=resource;
    }

   @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.list_item_my_item,parent,false);

        TextView tvName=(TextView) convertView.findViewById(R.id.tvName);
        TextView tvPrice=(TextView) convertView.findViewById(R.id.tvPrice);
        TextView tvType=(TextView) convertView.findViewById(R.id.tvType);
        TextView tvDate=(TextView) convertView.findViewById(R.id.tvDate);



        Item curentItem =(Item) getItem(position);

        assert curentItem != null;
        tvName.setText(curentItem.getName());
        tvPrice.setText(String.valueOf(curentItem.getPrice()));
        tvType.setText(curentItem.getTypeOfItem());
        tvDate.setText(curentItem.getDate());


        return  convertView ;
    }
}
