package com.java.patterns.lld.tictactoe;

import com.java.patterns.lld.tictactoe.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Board gameBoard;
    Deque<Player> players;

    public void initializeGame(){

        players = new LinkedList<>();
        Player player1 = new Player("player1", new PlayingPieceX());
        Player player2 = new Player("player2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;

        while(noWinner){
            //get the player whose turn is, will put back the player one his turn is over
            Player playerTurn = players.removeFirst();

            //check are there any free cells available, if not then it's draw
            gameBoard.printBoard();
            List<int[]> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            //read the user input;
            System.out.println("Player: " + playerTurn.getName() + " enter row, column: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);


            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(row, column, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                //Player can not insert the piece into this cell, choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, column, playerTurn.getPlayingPiece().type);
            if(winner){
                return playerTurn.getName();
            }
        }

        return "tie";
    }

    boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;


        //check row
        for(int i=0;i<gameBoard.size; i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType){
                rowMatch = false;
                break;
            }
        }

        //column check
        for(int j=0;j<gameBoard.size;j++){
            if(gameBoard.board[j][column] == null || gameBoard.board[j][column].type != pieceType){
                columnMatch = false;
                break;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
