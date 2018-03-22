package com.ehab.scorekeeper;

/**
 * Created by ehabhamdy on 3/22/18.
 */

public class Player {
    private int score;
    private int fouls;

    public Player(int score, int fouls) {
        this.score = score;
        this.fouls = fouls;
    }

    public int getScore() {
        return score;
    }

    public int getFouls() {
        return fouls;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }
}
