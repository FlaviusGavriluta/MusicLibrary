package com.codecool.ui;

import com.codecool.service.logger.Logger;

import java.util.Scanner;

public class MusicLibraryUi {
    private final Logger logger;

    public MusicLibraryUi(Logger logger) {
        this.logger = logger;
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

    private static void addSong() {
    }

    private static void viewLibrary() {
    }
}

