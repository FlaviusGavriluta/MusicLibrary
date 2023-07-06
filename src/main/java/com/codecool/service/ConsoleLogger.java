package com.codecool.service;

import static java.lang.System.*;

public class ConsoleLogger implements Logger {
    @Override
    public void info(String message) {
        out.println("[INFO] " + message);
    }

    @Override
    public void error(String message) {
        out.println("[ERROR] " + message);
    }

    @Override
    public void warning(String message) {
        out.println("[WARNING] " + message);
    }
}
