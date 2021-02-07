package com.tsarenko.homework.hw.Homework.LoggerHW10;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerHW {
    public void log(String messege) {
    }

    public void log(String message, LogLevel level) throws IOException {
    }

    String getDate() {
        SimpleDateFormat date = new SimpleDateFormat("y-MM-dd hh:m:ss");
        return date.format(new Date());
    }
}