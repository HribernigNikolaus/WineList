package com.example.nad.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private List<Wine> listWines;

    private ListView myListView;

    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myWineList);

        listWines = new ArrayList<>();
        listWines.add(new Wine(14, "Pfiffikus", "Lenz Moser", "Burgenland" ));
        listWines.add(new Wine(14, "Grüner Veltliner", "Wegenstein", "Burgenland" ));
        listWines.add(new Wine(15, "Sangiovese", "Botte Buona", "Italien" ));
        listWines.add(new Wine(14, "Small Hill Rot", "Hillinger", "Burgenland" ));
        listWines.add(new Wine(12, "Small Hill Weiß", "Hillinger", "Burgenland" ));
        listWines.add(new Wine(14, "Stell White", "Stell", "Südafrika" ));


        myAdapter = new CustomAdapter(this,listWines);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Wine selectedWine = listWines.get(i);
        Intent intent = new Intent(view.getContext(),ShowWineActivity.class);
        intent.putExtra("Wine",selectedWine);
        startActivity(intent);

    }
}