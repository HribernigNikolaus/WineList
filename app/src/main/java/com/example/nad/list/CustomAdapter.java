package com.example.nad.list;

/**
 * Created by Nad on 25.11.2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by hribernn15 on 18.11.2016.
 */

public class CustomAdapter extends android.widget.BaseAdapter {

    List<Wine> listWines;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Wine> listWines) {
        this.context = applicationContext;
        this.listWines= listWines;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listWines.size();
    }

    @Override
    public Object getItem(int i) {
        return listWines.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewBrand=(TextView)view.findViewById(R.id.textViewListBrand);
        TextView viewLocation=(TextView)view.findViewById(R.id.textViewListLocation);
        TextView viewPercentage=(TextView)view.findViewById(R.id.textViewListPercentage);

        Wine Wine = listWines.get(i);
        viewName.setText(Wine.getName());
        viewBrand.setText(Wine.getBrand());
        viewLocation.setText(Wine.getLocation());
        viewPercentage.setText(Wine.getPercentage());
        return view;
    }
}