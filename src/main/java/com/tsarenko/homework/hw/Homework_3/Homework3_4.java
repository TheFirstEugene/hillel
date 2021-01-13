package com.tsarenko.homework.hw.Homework_3;
import java.util.Scanner;
//Вариант_1
public class Homework3_4 {
    public static void main(String[] args) {
        System.out.println("Сколько Вам полных лет?");
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Возраст не может быть отрицательным!");
        }else if (age>0 && age<13){
            System.out.println("Вы ещё ребёнок");
        }else if(age> 12 && age<18) {
            System.out.println("Вы подросток");
        }else if (age>17 && age<65){
            System.out.println("Вы взрослый");
        }else if(age >64){
            System.out.println("Вы пожилой человек");
        }

    }
}
