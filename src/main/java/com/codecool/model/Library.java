package com.codecool.model;

import java.util.Collection;
import java.util.Comparator;

public class Library {
    private Collection<Song> songs;

    public Library(Collection<Song> songs) {
        this.songs = songs;
    }

//
//    private static final Song[] songs = {
//            new Song("Drivers License", "Olivia Rodrigo", 242),
//            new Song("Good 4 U", "Olivia Rodrigo", 178),
//            new Song("Levitating", "Dua Lipa", 203),
//            new Song("Don't Start Now", "Dua Lipa", 183),
//            new Song("Blinding Lights", "The Weeknd", 201),
//            new Song("Save Your Tears", "The Weeknd", 215),
//            new Song("Montero (Call Me By Your Name)", "Lil Nas X", 137),
//            new Song("Old Town Road", "Lil Nas X", 113),
//            new Song("Peaches", "Justin Bieber", 198),
//            new Song("Stay", "The Kid LAROI, Justin Bieber", 141),
//            new Song("Watermelon Sugar", "Harry Styles", 174),
//            new Song("Adore You", "Harry Styles", 207),
//            new Song("Positions", "Ariana Grande", 173),
//            new Song("Thank U, Next", "Ariana Grande", 207),
//            new Song("Intentions", "Justin Bieber ft. Quavo", 212),
//            new Song("Lonely", "Justin Bieber, Benny Blanco", 149),
//            new Song("Kiss Me More", "Doja Cat ft. SZA", 208),
//            new Song("Say So", "Doja Cat", 237),
//            new Song("Dynamite", "BTS", 199),
//            new Song("Butter", "BTS", 164),
//    };

    public void addSong(String title, String artist, int lengthInSeconds) {
        Song song = new Song(title, artist, lengthInSeconds);
        songs.add(song);
    }

    public void viewLibrary() {
        songs.stream()
                .sorted(Comparator.comparing(Song::getArtist))
                .forEach(System.out::println);
    }

    public void searchSongs(String artist) {
        songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .forEach(System.out::println);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
    }

    public void clearLibrary(){
        songs.clear();
    }
}
