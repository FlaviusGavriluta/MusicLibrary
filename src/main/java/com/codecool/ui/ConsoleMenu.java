package com.codecool.ui;

import com.codecool.service.Logger;

public class ConsoleMenu {
    private final Logger logger;

    public ConsoleMenu(Logger logger) {
        this.logger = logger;
    }

    void displayWelcomeMessage() {
        logger.info("Welcome to Codecool Music Library.");
    }

    void displayMenu() {
        logger.info("1 - Add Song");
        logger.info("2 - View Library");
        logger.info("3 - Search Songs");
        logger.info("4 - Remove Song");
        logger.info("5 - Clear Library");
        logger.info("6 - Exit");
    }
}
