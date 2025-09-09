package com.java.patterns.patterns.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {

    List<Memento> snapshots = new ArrayList<>();

    public void addSnapshot(Memento memento){
        snapshots.add(memento);
    }

    public Memento undo(){

        if(!snapshots.isEmpty()) {
            Memento preSnapshot = snapshots.get(snapshots.size() - 1);
            snapshots.removeLast();
            return preSnapshot;
        }

        return null;
    }
}
