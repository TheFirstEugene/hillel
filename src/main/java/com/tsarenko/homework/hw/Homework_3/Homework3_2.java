package com.tsarenko.homework.hw.Homework_3;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста ваш РОСТ в сантиметрах");
        double height = sc.nextDouble();
        System.out.println("Теперь введите ваш вес");
        double weight = sc.nextDouble();
        double bmi = weight/((height*height/10000));
        if(bmi<=18.5) {
            System.out.println("У вас недостаточный вес");
        }else if (bmi<=25.0) {
            System.out.println("У вас нормальный вес");
        }else if (bmi<=30.0) {
            System.out.println("У вас излишний вес");
        }else if(bmi>30) {
            System.out.println("У вас ожирение");
        }
    }
}
