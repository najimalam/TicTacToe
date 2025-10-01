package controllers;

import java.nio.InvalidMarkException;
import java.util.List;

import models.*;

public class GameController {
    // GameController logic here

    public Game startGame(int dimension, List<Player> players, List<WinningStrategyType> winningStrategyTypes) {
        // Start game logic
        return Game.getBuilder()
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
    public void makeMove(Game game) throws InvalidMarkException{
        game.getMoves();
    }
    //game state
    public GameState getGameState(Game game){
        return game.getGameState();
    }
    //undo move
    //check winner

}
