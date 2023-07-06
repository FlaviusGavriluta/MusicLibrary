package com.codecool;

import com.codecool.model.Library;
import com.codecool.ui.MusicLibraryUi;
import com.codecool.service.Logger;
import com.codecool.service.ConsoleLogger;

public class Application {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Library library = new Library(logger);
        MusicLibraryUi ui = new MusicLibraryUi(logger, library);
        ui.run();
    }
}

