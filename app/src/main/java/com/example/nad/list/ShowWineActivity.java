package com.example.nad.list;

/**
 * Created by Nad on 25.11.2016.
 */
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ShowWineActivity extends AppCompatActivity {

    private Wine Wine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_wine);

        Intent intent = getIntent();
        Wine = (Wine) intent.getExtras().get("Wine");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewBrand = (TextView) findViewById(R.id.textViewBrand);
        TextView viewLocation = (TextView) findViewById(R.id.textViewLocation);
        TextView viewPercentage = (TextView) findViewById(R.id.textViewPercentage);

        viewName.setText(Wine.getName());
        viewBrand.setText(Wine.getBrand());
        viewLocation.setText(Wine.getLocation());
        viewPercentage.setText(String.valueOf(Wine.getPercentage()));

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q=" + Wine.getLocation());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

}