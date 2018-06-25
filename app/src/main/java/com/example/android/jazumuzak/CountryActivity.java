package com.example.android.jazumuzak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Backwards", "Rascal Flatts", "Country"));
        songs.add(new Song("Beer in Mexico", "Kenny Chesney", "Country"));
        songs.add(new Song("Fast Cars and Freedom", "Rascal Flatts", "Country"));
        songs.add(new Song("Freedom", "Kenny Chesney", "Country"));
        songs.add(new Song("Living In Fast Forward", "Kenny Chesney", "Country"));
        songs.add(new Song("Love you Out Loud", "Rascal Flatts", "Country"));
        songs.add(new Song("My Wish", "Rascal Flatts", "Country"));
        songs.add(new Song("The Road and The Radio", "Kenny Chesney", "Country"));
        songs.add(new Song("Summertime", "Kenny Chesney", "Country"));
        songs.add(new Song("What Hurts The Most", "Rascal Flatts", "Country"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_songs.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
