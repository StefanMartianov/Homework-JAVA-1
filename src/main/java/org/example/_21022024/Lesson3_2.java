package org.example._21022024;

public class Lesson3_2 {
    public static void main(String[] args) {

////    Даны три переменные, вещественные числа number1, number2, и символьный operation, который может содержать следующие символы (+ - * /).
////    Написать программу "Калькулятор" которая будет выводить на консоль результат соответствующих вычислений.
//
//        double number1 = 15;
//        double number2 = 0;
//        char operation = '/';
//
//        if (operation == '*') {
//            System.out.println(number1 * number2);
//
//        } else if (operation == '/') {
//            if (number2 == 0) {
//                System.out.println("Error");
//            } else {
//                System.out.println(number1 / number2);
//            }
//
//        } else if (operation == '-') {
//            System.out.println(number1 - number2);
//
//        } else if (operation == '+') {
//            System.out.println(number1 + number2);
//        }

//        switch (operation){
//            case '*' :
//                System.out.println(number1 * number2);
//                break;
//            case '/':if (number2 == 0) {
//                System.out.println("Error");
//            } else {
//                System.out.println(number1 / number2);
//            }
//                break;
//
//            case '+':
//                System.out.println(number1 + number2);
//                break;
//            case '-':
//                System.out.println(number1 - number2);
//                break;
//            default:
//                System.out.println("Error");
//        }

//        В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
        int count = 0;
        for (int i = 0; i <= 100;i++) {
            if (count == 26 ){
                break;
            }
            if (i % 2 == 0 && i % 10 != 0 ){
                count++;
                System.out.println(i);
            }
        }
   }
}
