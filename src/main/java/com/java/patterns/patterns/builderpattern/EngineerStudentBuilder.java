package com.java.patterns.patterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");

        this.subjects = subjects;

        return this;
    }
}
