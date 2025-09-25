package models;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int currentPlayerIndex;
    private GameState gameState;


    public Board getBoard() {
        return board;
    }


    public void setBoard(Board board) {
        this.board = board;
    }


    public List<Player> getPlayers() {
        return players;
    }


    public void setPlayers(List<Player> players) {
        this.players = players;
    }


    public List<Move> getMoves() {
        return moves;
    }


    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }


    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }


    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }


    public GameState getGameState() {
        return gameState;
    }


    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }


    public void start(){
        System.out.println("Game Started!");
    }
}
