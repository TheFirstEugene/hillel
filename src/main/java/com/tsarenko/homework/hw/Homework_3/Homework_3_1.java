package com.tsarenko.homework.hw.Homework_3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько часов проехал Натан на велосипеде?");
        try {
            double time = sc.nextDouble();
            double litres = time * 0.5;
            System.out.println("В итоге Натан выпьет " + Math.floor(litres) + " литров воды");
        } catch (InputMismatchException e) {
            System.err.println("Ведите число с использованием запятой, а не точки");

        }
    }
}