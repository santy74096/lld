package com.java.patterns.patterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Finance");
        subjects.add("HR");

        this.subjects = subjects;

        return this;
    }
}
