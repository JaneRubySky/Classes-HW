package com.company;

/* Create your main() method here - this is where you create and manipulate instances of the other classes; do the
following steps inside main()
Create a new instance of User
Create at least 5 new instances of Song and assign each to a variable (You can come up with creative values or just use
"song1", "artist1", etc.)
Create at least 2 instances of Playlist, add multiple Song objects to each, then add those Playlist objects to your User
 object
Use the methods you defined and print out the names of your user's playlists, then "play" each song in each playlist so
the songs print out as well
*/

public class Main {

    public static void main(String[] args) {

        User personOne = new User();
        Song songOne = new Song("a", "b", "c");
        Song songTwo = new Song("e", "f", "g");
       Song songThree = new Song("h", "i", "j");
        Song songFour = new Song("k", "l", "m");
        Song songFive = new Song("n", "o", "p");

        Playlist playlistOne = new Playlist();


        playlistOne.addSong(songOne);
        playlistOne.addSong(songTwo);
        playlistOne.addSong(songThree);

        Playlist playlistTwo = new Playlist ();
        playlistTwo.addSong(songFive);
        playlistTwo.addSong(songFour);

//        System.out.println(playlist);


        for (int i = 0; i < 3; i++) {

            playlistOne.getmSongs().get(i).play();
            //songOne.play();

        }
        for (int i = 0; i < 2; i++) {
            playlistTwo.getmSongs().get(i).play();
        }

    }

}
