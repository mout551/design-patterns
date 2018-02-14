package com.erwan;

public class Main {

    public static void main(String[] args) {
        
        Context add = new Context(new Add());
        System.out.println("Addition = " + add.executeStategy(4, 5));
    }
}
