package com.example.android.jazumuzak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlternativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Alive with the Glory of Love", "Say Anything", "Alternative"));
        songs.add(new Song("American Idiot", "Green Day", "Alternative"));
        songs.add(new Song("Baby, I\'m a Blur", "Say Anything", "Alternative"));
        songs.add(new Song("Boulevard of Broken Dreams", "Green Day", "Alternative"));
        songs.add(new Song("Holiday", "Green Day", "Alternative"));
        songs.add(new Song("In Defense of the Genre", "Say Anything", "Alternative"));
        songs.add(new Song("Jesus of Suburbia", "Green Day", "Alternative"));
        songs.add(new Song("She's a Rebel", "Green Day", "Alternative"));
        songs.add(new Song("Shiksa (Girlfriend)", "Say Anything", "Alternative"));
        songs.add(new Song("Wake me Up When September Ends", "Green Day", "Alternative"));

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
