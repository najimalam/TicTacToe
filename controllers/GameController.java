package controllers;

import java.nio.InvalidMarkException;
import java.util.List;

import models.*;

public class GameController {
    // GameController logic here

    public void startGame(int dimension, List<Player> players, List<WinningStrategyType> winningStrategyTypes) {
        // Start game logic
        Game.getBuilder()
                .setBoard(dimension)
                .setPlayers(players)
                .setWinningStrategyType(winningStrategyTypes)
                .build();

    }

    //print board
    public void printBoard(Game game){
        Board board = game.getBoard();
        board.printBoard();
    }
    //make move
    public void makeMove() throws InvalidMarkException{}
    //game state
    //undo move
    //check winner

}
