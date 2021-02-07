package com.tsarenko.homework.hw.Homework.LoggerHW10;

public class ConsoleLogger extends LoggerHW {
    @Override
    public void log(String messege) {
        System.out.println(getDate() + " " + messege);
    }

    @Override
    public void log(String message, LogLevel level) {
        System.out.println(getDate() + " " + level + ": " + message);
    }
}
