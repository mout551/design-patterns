package com.erwan;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void ShowMessage(){
        System.out.println("ShowMessage from SingleObject class.");
    }
}
