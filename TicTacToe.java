import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Game;
import models.Player;
import models.PlayerType;


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

        
    }

    
}
