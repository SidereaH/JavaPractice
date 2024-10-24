package org.javapractice.oct15.kt.geometry;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Площадь фигуры " + i+ ": " + shapes[i].area());
        }
    }
}