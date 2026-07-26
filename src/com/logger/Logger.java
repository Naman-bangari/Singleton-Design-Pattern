package com.logger;

import com.enums.LogLevel;

public class Logger {
    static Logger instance = null;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {

                if (instance == null) {

                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(LogLevel level, String message) {
        System.out.println("[" + level + "] " + message);
    }
}
