package com.example.android.jazumuzak;
// This class defines com.example.android.jazumuzak.Song object, contains song titles, artist, and genre information.
public class Song {
    private String mSongTitle;
    private String mSongArtist;
    private String mSongGenre;

    public Song(String songTitle, String songArtist, String songGenre){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongGenre = songGenre;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public String getSongGenre() {
        return mSongGenre;
    }

    public String getSongTitle() {
        return mSongTitle;
    }
}

