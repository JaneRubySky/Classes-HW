package com.company;

/* Define 2 member variables: mName and mSongs, where the latter is an ArrayList of Song objects
Define a constructor method that does the following:
Takes playlist name as an input and assigns it to the corresponding member variable
Instantiates mSongs as a new, empty ArrayList
Define a method getName() that returns the playlist's name as a String
Define a method addSong(Song song) that takes a Song object as input and adds it to the list
Define a playAll() method that calls the play() method from each Song object in the list

*/

import java.util.ArrayList;

/**
 * Created by janerubygrissom on 6/27/16.
 */
public class Playlist {

    String mName;
    ArrayList<Song> mSongs = new ArrayList<>();

    public String playName(String name) {

        mName = name;
        mSongs = new ArrayList<>();
        return mName;
    }
    String getmName = "";

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {

        mSongs.add(song);
    }

    public void playAll() {

        for (int i = 0; i < mSongs.size(); i++) {
            mSongs.get(i).play();
        }
    }

    public ArrayList<Song> getmSongs() {
        return mSongs;
    }

    public void setmSongs(ArrayList<Song> mSongs) {
        this.mSongs = mSongs;
    }
}



