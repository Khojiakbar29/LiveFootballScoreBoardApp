package com.example.livefootballscoreboardapp.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
    private List<Game> gamesInProgress;

    public ScoreBoard() {
        gamesInProgress = new ArrayList<>();
    }

    public void addNewGame(String homeTeam, String awayTeam) {
        Game g = new Game(homeTeam, awayTeam);
        gamesInProgress.add(g);
    }

    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Game g = findGame(homeTeam, awayTeam);
    }
}
