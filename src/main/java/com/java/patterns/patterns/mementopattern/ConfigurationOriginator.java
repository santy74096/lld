package com.java.patterns.patterns.mementopattern;

public class ConfigurationOriginator {

    int height;
    int width;

    public ConfigurationOriginator(int height, int width){
        this.height = height;
        this.width  = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public Memento createMemento(){
        return new Memento(this.height, this.width);
    }

    public void restoreStoreConfiguration(Memento memento){
        this.height = memento.height;
        this.width = memento.width;
    }
}
