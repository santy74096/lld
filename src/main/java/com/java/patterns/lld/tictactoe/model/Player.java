package com.java.patterns.lld.tictactoe.model;

import lombok.Data;

@Data
public class Player {

    String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

}
