package org.example._21022024;

public class Lesson3 {
    //    Дано 5 чисел:  а=10,  b=15, c= 20, d=25, e=30.
//    Переприсвоить и вывести их на экран в том же порядке(a,b,c,d,e), НО, таким образом, чтобы каждая переменная принимала “следующее” значение из этой цепочки.
//    Пример: было а=10 стало а=15;  было е=30 стало е=10.
//    Примечание: присваивать “напрямую” значения нельзя, все манипуляции должны происходить за счёт переменных, а не их значений.
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int e = 30;
        int c = 20;
        int d = 25;
        int temp = a;

        a = b;
        b = c;
        c = d;
        d = e;
        e = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
