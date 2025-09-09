package com.java.patterns.patterns.flyweightpatter;

public class Client {

    public static void main(String[] args) {
        Letter obj1 = LetterFactory.createLetter('t');
        obj1.display(2, 3);
        Letter obj2 = LetterFactory.createLetter('t');
        obj2.display(4, 5);
    }
}
