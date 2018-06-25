package com.example.android.jazumuzak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1000 Words", "Eguchi Matsueda", "Pop"));
        songs.add(new Song("Alejandro", "Lady Gaga", "Pop"));
        songs.add(new Song("Alive with the Glory of Love", "Say Anything", "Alternative"));
        songs.add(new Song("All I Ever Wanted", "Shinedown", "Rock"));
        songs.add(new Song("American Idiot", "Green Day", "Alternative"));
        songs.add(new Song("Baby, I\'m a Blur", "Say Anything", "Alternative"));
        songs.add(new Song("Backwards", "Rascal Flatts", "Country"));
        songs.add(new Song("Bad Romance", "Lady Gaga", "Pop"));
        songs.add(new Song("Beer in Mexico", "Kenny Chesney", "Country"));
        songs.add(new Song("Boulevard of Broken Dreams", "Green Day", "Alternative"));
        songs.add(new Song("Boys Boys Boys", "Lady Gaga", "Pop"));
        songs.add(new Song("The Fame", "Lady Gaga", "Pop"));
        songs.add(new Song("Fast Cars and Freedom", "Rascal Flatts", "Country"));
        songs.add(new Song("Freedom", "Kenny Chesney", "Country"));
        songs.add(new Song("Holiday", "Green Day", "Alternative"));
        songs.add(new Song("In Defense of the Genre", "Say Anything", "Alternative"));
        songs.add(new Song("Jesus of Suburbia", "Green Day", "Alternative"));
        songs.add(new Song("Living In Fast Forward", "Kenny Chesney", "Country"));
        songs.add(new Song("Love you Out Loud", "Rascal Flatts", "Country"));
        songs.add(new Song("My Wish", "Rascal Flatts", "Country"));
        songs.add(new Song("Poker Face", "Lady Gaga", "Pop"));
        songs.add(new Song("The Road and The Radio", "Kenny Chesney", "Country"));
        songs.add(new Song("Santeria", "Sublime", "Rock"));
        songs.add(new Song("She's a Rebel", "Green Day", "Alternative"));
        songs.add(new Song("Shiksa (Girlfriend)", "Say Anything", "Alternative"));
        songs.add(new Song("Simple Man", "Shinedown", "Rock"));
        songs.add(new Song("Summertime", "Kenny Chesney", "Country"));
        songs.add(new Song("Teeth", "Lady Gaga", "Pop"));
        songs.add(new Song("Wake me Up When September Ends", "Green Day", "Alternative"));
        songs.add(new Song("What Hurts The Most", "Rascal Flatts", "Country"));
        songs.add(new Song("What I Got", "Sublime", "Rock"));
        songs.add(new Song("Wrong Way", "Sublime", "Rock"));


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
