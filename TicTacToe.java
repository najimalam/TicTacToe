import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controllers.GameController;
import models.Game;
import models.GameState;
import models.Player;
import models.PlayerType;
import models.WinningStrategyType;
import straregies.winningStrategies.WinningStrategy;
import straregies.winningStrategies.WinningStrategyFactory;


public class TicTacToe {
    //main class
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dimension = 3; // Default dimension

        //set board dimension


        Player player1 = new Player("Najim", 'X', PlayerType.HUMAN);
        Player player2 = new Player("BotPlayer", 'O', PlayerType.BOT);

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        List<WinningStrategyType> winningStrategies = new ArrayList<>();
        winningStrategies.add(WinningStrategyType.ROW);
        winningStrategies.add(WinningStrategyType.COLUMN);
        winningStrategies.add(WinningStrategyType.DIAGONAL);

        GameController gameController = new GameController();
       Game game = gameController.startGame(dimension, players, winningStrategies);

        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            //print board
            gameController.printBoard(game);
            //make move
            try{
                gameController.makeMove(game);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }

    
}
