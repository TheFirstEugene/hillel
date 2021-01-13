package com.tsarenko.homework.hw.Homework_3;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        System.out.println("Введите желаемый год чтобы узнать столетие ");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if(a%100==0) {
            System.out.println("Это " + a/100+ " столетие");
        }else {
            int b = (a/100) + 1;
            System.out.println("Это " + b + " столетие");
        }
    }
}
