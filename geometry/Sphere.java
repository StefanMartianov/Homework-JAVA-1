package org.example.HomeworkJAVA.geometry;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
