package com.java.patterns.patterns.mementopattern;

public class Client {

    public static void main(String[] args) {
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();

        ConfigurationOriginator originator = new ConfigurationOriginator(2, 3);
        Memento snapshot1 = originator.createMemento();

        caretaker.addSnapshot(snapshot1);

        originator.setHeight(4);
        originator.setWidth(3);

        Memento snapshot2 = originator.createMemento();

        caretaker.addSnapshot(snapshot2);

        originator.setHeight(6);
        originator.setWidth(2);

        System.out.println("height: " + originator.height + "  " + "width: " + originator.width);

        Memento lastSnapshot = caretaker.undo();
        originator.restoreStoreConfiguration(lastSnapshot);

        System.out.println("props after restoring the previous snapshot");
        System.out.println("height: " + originator.height + "  " + "width: " + originator.width);
    }
}
