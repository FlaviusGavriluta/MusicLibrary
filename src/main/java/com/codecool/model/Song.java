package com.codecool.model;

public record Song(String title, String artist, int lengthInSeconds) {
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
