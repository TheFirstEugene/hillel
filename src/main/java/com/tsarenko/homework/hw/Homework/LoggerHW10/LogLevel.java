package com.tsarenko.homework.hw.Homework.LoggerHW10;

public enum LogLevel {
    TRACE, DEBUG, INFO, WARNING, ERROR, FATAL, ALL;
    String name;

    LogLevel() {
    }

    public String getLvl() {
        return name;
    }
}
