package com.codecool.musiclibrary;

import com.codecool.musiclibrary.model.Song;
import com.codecool.musiclibrary.ui.MusicLibraryUi;
import com.codecool.musiclibrary.service.logger.Logger;
import com.codecool.musiclibrary.service.impl.ConsoleLogger;

public class Application {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        MusicLibraryUi ui = new MusicLibraryUi(logger);
        ui.run();
    }
}

