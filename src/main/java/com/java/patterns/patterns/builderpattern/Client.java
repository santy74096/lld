package com.java.patterns.patterns.builderpattern;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        Student st = new EngineerStudentBuilder()
                .setName("name")
                .setAge(35)
                .setSubjects()
                .build();

        System.out.println(st.age);
    }
}
