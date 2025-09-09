package com.java.patterns.patterns.statepattern;

public class TvContext implements State{

    State state;

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
