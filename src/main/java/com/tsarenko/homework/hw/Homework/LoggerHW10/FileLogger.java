package com.tsarenko.homework.hw.Homework.LoggerHW10;

import java.io.*;

public class FileLogger extends LoggerHW {
    @Override
    public void log(String messege) {
        PrintWriter pr = null;
        try {
            pr = new PrintWriter("D:/TestFilesForIdea/example_1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pr.print(getDate() + ": " + messege);
        pr.close();

        //Второй вариант

        /*Writer wr;
        try {
            wr = new FileWriter("example.txt",true);
            wr.write(getDate() + " " + messege);
            wr.close();
        } catch (IOException e) {
            System.err.println("Error!");
        }*/
    }

    @Override
    public void log(String message, LogLevel level) throws IOException {
        PrintWriter pr = new PrintWriter("D:/TestFilesForIdea/example_2.txt");
        pr.print(getDate() + ": " + level + " " + message);
        pr.close();

        //Тоже самое

        /*Writer wr  = new FileWriter("example.txt",true);
        wr.write(getDate() + " " + level + ": " + message);
        wr.close(); */
    }
}