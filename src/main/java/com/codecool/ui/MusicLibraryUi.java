package com.codecool.ui;

import com.codecool.model.Library;
import com.codecool.service.Logger;

import static java.lang.System.*;

import java.util.Scanner;

public class MusicLibraryUi {
    private final Logger logger;
    private final Library library;

    public MusicLibraryUi(Logger logger, Library library) {
        this.logger = logger;
        this.library = library;
    }

    public void run() {
        displayWelcomeMessage();

        int code = 0;

        while (code != 6) {
            displayMenu();
            code = getCode();

            switch (code) {
                case 1 -> addSong();
                case 2 -> viewLibrary();

                //...
            }
            //...
        }
    }

    private void displayWelcomeMessage() {
        logger.info("Welcome to Codecool Music Library.");
    }

    private void displayMenu() {
        logger.info("1 - Add Song");
        logger.info("2 - View Library");
        logger.info("3 - Search Songs");
        logger.info("4 - Remove Song");
        logger.info("5 - Clear Library");
        logger.info("6 - Exit");
    }

    private static int getCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void addSong() {
        Scanner scanner = new Scanner(in);
        logger.info("Enter the name of the song: ");
        String title = scanner.nextLine();
        logger.info("Enter the name of the artist: ");
        String artist = scanner.nextLine();
        logger.info("Enter the duration of the song in seconds: ");
        int duration = scanner.nextInt();
        library.addSong(title, artist, duration);
        logger.info("Song added successfully.");
    }

    private void viewLibrary() {
        library.viewLibrary();
    }

    private void searchSongs() {
        Scanner scanner = new Scanner(in);
        logger.info("Enter the name of the artist: ");
        String artist = scanner.nextLine();
        library.searchSongs(artist);
    }

    private void removeSong() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter the name of the song to remove:");
        String title = scanner.nextLine();

        library.removeSong(title);

        logger.info("Song removed successfully.");
    }

    private void clearLibrary() {
        library.clearLibrary();
        logger.info("Library cleared successfully.");
    }
}

