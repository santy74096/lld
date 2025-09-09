package com.java.patterns.patterns.flyweightpatter;

public class DocumentCharacter implements Letter{

    char character;
    int size;
    String font;

    public DocumentCharacter(char character, int size, String font){
        this.character = character;
        this.size = size;
        this.font = font;
    }

    @Override
    public void display(int x, int y) {

    }
}
