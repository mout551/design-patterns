package com.erwan;

public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fill();
    }
}
