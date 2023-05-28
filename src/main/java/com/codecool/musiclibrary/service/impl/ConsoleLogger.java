package com.codecool.musiclibrary.service.impl;

import com.codecool.musiclibrary.service.logger.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println("[WARNING] " + message);
    }
}
