package com.tsarenko.homework.hw.Homework_3;
import java.util.Scanner;
//решение 3 задания с использованием тернарного оператора
public class HW3_3_ver2 {
    public static void main(String[] args) {
        System.out.println("Введите желаемый год чтобы узнать столетие ");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a/100) + 1;
        String year = (a%100==0) ? "Это " + a/100+ " столетие" : "Это " + b + " столетие";
        System.out.println(year);
    }
}
