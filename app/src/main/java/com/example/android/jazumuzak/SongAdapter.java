package com.example.android.jazumuzak;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        /*
        Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        the second argument is used when the ArrayAdapter is populating a single TextView.
        Because this is a custom adapter for three TextViews, the adapter is not
        going to use this second argument, so it can be any value. Here, we used 0.
        */
        super(context, 0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Get the Song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_view.xml layout with the ID song_title
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        // Get the song title from the current Song object and
        // set this text on the title TextView
        songTitleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_view.xml layout with the ID song_artist
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        // Get the song artist from the current Song object and
        // set this text on the artist TextView
        songArtistTextView.setText(currentSong.getSongArtist());

        // Find the TextView in the list_view.xml layout with the ID song_genre
        TextView songGenreTextView = (TextView) listItemView.findViewById(R.id.song_genre);
        // Get the genre from the current Song object and
        // set this text on the genre TextView
        songGenreTextView.setText(currentSong.getSongGenre());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
