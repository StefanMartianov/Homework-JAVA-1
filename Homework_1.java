package org.example.HomeworkJAVA;

import org.example.HomeworkJAVA.geometry.Cube;
import org.example.HomeworkJAVA.geometry.Rectangle;
import org.example.HomeworkJAVA.geometry.Sphere;
import org.example.HomeworkJAVA.geometry.Trapeze;

public class Homework_1 {
    public static void main(String[] args) {
//        Написать математические формулы, в отдельных классах используя Мейн метод:
//        -площадь треугольника;
//        -объём куба;
//        -периметр трапеции;
//        -площадь сферы.

//Домашка на "погуглить" (наверняка java знает как возводить в степень или извлекать корень)


        Rectangle myRectangle = new Rectangle(5,10);
        System.out.println(myRectangle.calculateArea());

        Cube myCube = new Cube(10);
        System.out.println(myCube.calculateVolume());

        Trapeze myTrapeze = new Trapeze(5,7,4,10,8);
        System.out.println(myTrapeze.calculatePerimeter());

        Sphere mySphere = new Sphere(4);
        System.out.println(mySphere.calculateArea());


}
}
