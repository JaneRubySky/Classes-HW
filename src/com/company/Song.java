package com.company;

/* Define 3 member variables: mSongName, mArtistName, mAlbumName
Define a constructor method that takes song name, artist name, and album name as inputs, and assigns those values to the
corresponding member variables
Define a method play() that just prints the name, artist, & album to the command line (since we don't know how to
actually play media files yet)
*/

/**
 * Created by janerubygrissom on 6/27/16.
 */
public class Song {

    String mSongName;
    String mArtistName;
    String mAlbumName;

    public Song(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play() {
        System.out.println(mSongName + " " + mArtistName + " " + mAlbumName);
    }

}
