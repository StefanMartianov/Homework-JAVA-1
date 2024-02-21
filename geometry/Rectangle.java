package org.example.HomeworkJAVA.geometry;

public class Rectangle {
   private int base;
   private int height;

   public Rectangle(int base,int height) {
       this.base = base;
       this.height = height;
   }

   public int calculateArea() {
       return base * height;
   }
}
