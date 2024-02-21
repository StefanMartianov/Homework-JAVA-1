package org.example.HomeworkJAVA.geometry;

public class Trapeze {
    private double sideA;
    private double sideB;
    private double height;
    private double base1;
    private double base2;

    public Trapeze(double sideA,double sideB, double height,double base1, double base2 ) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    public double calculatePerimeter() {
        return sideA + sideB + base2 + base1;
    }
}
