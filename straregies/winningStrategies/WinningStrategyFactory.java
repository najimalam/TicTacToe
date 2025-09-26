package straregies.winningStrategies;

import models.WinningStrategyType;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType type){
        switch(type){
            case ROW:
                return new RowWinningStrategy();
            case COLUMN:
                return new ColWinningStrategy();
            case DIAGONAL:
                return new DiagonalWinningStrategy();
            default:
                throw new RuntimeException("Invalid Winning Strategy Type");
        }
    }
}
