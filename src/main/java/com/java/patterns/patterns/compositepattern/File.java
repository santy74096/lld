package com.java.patterns.patterns.compositepattern;

public class File implements FileSystem{

    String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("fileName: " + fileName);
    }
}
