package models;

import java.util.Scanner;

public class Player {
    
    private String name;;
    private Symbol symbol;
    private PlayerType type;

    public Player(String name, char symbol, PlayerType type) {
        this.name = name;
        this.symbol = new Symbol(symbol);
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
    public PlayerType getType() {
        return type;
    }
    public void setType(PlayerType type) {
        this.type = type;
    }

    public Move makeMove(Board board){
        System.out.println("Please enter your move (row and column):");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        return new Move(this, row, col);
    }

    
}
