package org.example.HomeworkJAVA.geometry;

public class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int calculateVolume() {
        return side * side * side;
    }
}
