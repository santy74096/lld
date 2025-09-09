package com.java.patterns.patterns.mementopattern;

public class Memento {

    int height;
    int width;

    public  Memento(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }
}
