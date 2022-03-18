package com.company.Sodoku.problemdomain;

import com.company.Sodoku.problemdomain.Costants.GameState;

import java.io.Serializable;

public class SodokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SodokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getGridState() {
        return SodokuUtilities.copyToNewArray(gridState);
    }

}
