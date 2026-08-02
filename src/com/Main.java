package com;

import com.enums.LogLevel;
import com.logger.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log(LogLevel.INFO, "Application Started");

        logger.log(LogLevel.WARNING, "Memory Usage High");

        logger.log(LogLevel.ERROR, "Database Connection Failed");

        logger.log(LogLevel.DEBUG, "Applicaiton Started Under Debug mode");
    }
}
