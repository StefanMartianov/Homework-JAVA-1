package org.example._21022024;

public class Lesson3_1 {
//    Создать программу которая принимает на вход 3 вещественных числа,
//    и будет выводить на экран ТО число, чей остаток от деления на 1.5 -  меньше остальных.
//    Для наглядности выводить и сам остаток.


    public static void main(String[] args) {
        double a = 3.5;
        double b = 3.3;
        double c = 9.1;

        double reminderA = a % 1.5;
        double reminderB = b % 1.5;
        double reminderC = c % 1.5;

        if (reminderA < reminderB && reminderA < reminderC) {
            System.out.println(a);

        } else if (reminderB < reminderA && reminderB < reminderC) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


    }
}
