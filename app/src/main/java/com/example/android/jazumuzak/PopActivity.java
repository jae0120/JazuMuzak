package com.example.android.jazumuzak;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(PopActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1000 Words", "Eguchi Matsueda", "Pop"));
        songs.add(new Song("Alejandro", "Lady Gaga", "Pop"));
        songs.add(new Song("Bad Romance", "Lady Gaga", "Pop"));
        songs.add(new Song("Boys Boys Boys", "Lady Gaga", "Pop"));
        songs.add(new Song("The Fame", "Lady Gaga", "Pop"));
        songs.add(new Song("Poker Face", "Lady Gaga", "Pop"));
        songs.add(new Song("Teeth", "Lady Gaga", "Pop"));

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
