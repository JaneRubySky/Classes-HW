package com.company;

/* Define 2 member variables: mName and mPlaylists, where the latter is a HashMap that uses playlist names as keys and
the corresponding Playlist objects as values
Define a constructor method that does the following:
Takes user name as an input and assigns it to the corresponding member variable
Instantiates mPlaylists as a new, empty HashMap
Define a method addPlaylist(Playlist playlist) that takes a Playlist object as an input and adds it to the mPlaylists
map (hint: use the getName() method from the Playlist object to get the key to use for your map)
Define a method getAllPlaylistNames() that returns a collection of all the user's playlist names
Define a method getPlaylistByName(String name) that returns the Playlist from the collection that matches the name
parameter. If nothing in the collection matches that input, return null.

*/

import java.util.HashMap;
import java.util.Set;

/**
 * Created by janerubygrissom on 6/27/16.
 */
public class User {

    Playlist playlist;
    String name;

    HashMap<String, Playlist> hashMap = new HashMap<>();


    public void addPlaylist(String name, Playlist playlist) {
        HashMap<String, Playlist> hashMap = new HashMap<>();
        hashMap.put(playlist.getName(), playlist);
    }

    public Playlist getPlayListByName(String name, HashMap hashMap) {
        if (!hashMap.containsKey(name)) {
            return null;
        } else {
            return (Playlist) hashMap.get(name);
        }
    }

    public Set getAllPlaylistNames(HashMap hashMap) {
        return hashMap.keySet();

    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Playlist> getPlayLists() {
        return hashMap;
    }

//    public void setPlayLists(HashMap<String, Playlist> playLists) {
//        this.playList = playLists;
//    }
}
