package com.codecool.model;

import com.codecool.model.Song;
import com.codecool.service.Logger;

import java.util.*;

public class Library {
    private final List<Song> songs;
    private final Logger logger;

    public Library(Logger logger) {
        this.songs = new ArrayList<>();
        this.logger = logger;
    }

    public void addSong(String title, String artist, int lengthInSeconds) {
        Song song = new Song(title, artist, lengthInSeconds);
        songs.add(song);
        logger.info("Added song: " + song);
    }

    public void viewLibrary() {
        songs.stream()
                .sorted(Comparator.comparing(Song::getArtist))
                .forEach(System.out::println);
        logger.info("Viewed library");
    }

    public void searchSongs(String artist) {
        songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .forEach(System.out::println);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
    }

    public void clearLibrary() {
        songs.clear();
        logger.info("Cleared library");
    }
}