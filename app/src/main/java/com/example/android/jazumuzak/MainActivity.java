package com.example.android.jazumuzak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the alternative category
        TextView alt = (TextView) findViewById(R.id.alternative);

// Set a click listener on that View
        alt.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick (View view){
                Intent altIntent = new Intent(MainActivity.this, AlternativeActivity.class);
                startActivity(altIntent);
            }
        });

        // Find the View that shows the Country category
        TextView country = (TextView) findViewById(R.id.country);

// Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick (View view){
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the Pop category
        TextView pop = (TextView) findViewById(R.id.pop);

// Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the pop View is clicked on.
            @Override
            public void onClick (View view){
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });

        // Find the View that shows the Rock category
        TextView rock = (TextView) findViewById(R.id.rock);

// Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick (View view){
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the Rock category
        TextView allSongs = (TextView) findViewById(R.id.all_songs);

// Set a click listener on that View
        allSongs.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick (View view){
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

    }


}
