package com.tsarenko.homework.hw.Homework.LoggerHW10;

import java.io.IOException;

public class TestLogger {
    public static void main(String[] args) throws IOException {
        LoggerHW log1 = new ConsoleLogger();
        log1.log("Error ....");
        log1.log("Error", LogLevel.DEBUG);

        FileLogger log2 = new FileLogger();
        log2.log("Error", LogLevel.INFO);
        log2.log("Error again .... ");

    }
}
