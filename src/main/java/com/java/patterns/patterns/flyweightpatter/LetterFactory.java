package com.java.patterns.patterns.flyweightpatter;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<Character, Letter> cache = new HashMap<>();

    public static Letter createLetter(Character c){
        if(cache.containsKey(c)){
            return cache.get(c);
        } else{
            DocumentCharacter letter = new DocumentCharacter(c, 2, "Aerial");
            cache.put(c, letter);
            return letter;
        }
    }
}
