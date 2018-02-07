package com.erwan;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
    }
}
