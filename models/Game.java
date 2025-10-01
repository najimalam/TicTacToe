package models;

import java.util.List;

import straregies.winningStrategies.WinningStrategy;
import straregies.winningStrategies.WinningStrategyFactory;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int currentPlayerIndex;
    private GameState gameState;
    private List<WinningStrategyType> winningStrategyTypes;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        this.board = new Board();
        this.board.setDimension(builder.dimension);
        this.players = builder.players;
        this.currentPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategyTypes = builder.winningStrategyTypes;
        // Initialize winning strategies based on types
        for(WinningStrategyType type : this.winningStrategyTypes){
            this.winningStrategies.add(WinningStrategyFactory.getWinningStrategy(type));
        }
    }

    public Board getBoard() {
        return board;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }
    public GameState getGameState() {
        return gameState;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void makeMove(){
        Player currentPlayer = players.get(currentPlayerIndex);

        System.out.println("This is " + currentPlayer.getName() +"is move!");

        Move move = currentPlayer.makeMove(board);
    }


    public static class Builder{

        private int dimension;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public Builder setBoard(int dimension){
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }

        public Builder setWinningStrategyType(List<WinningStrategyType> winningStrategyTypes){
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        public Game build(){
            return new Game(this);
        }


    }


}
