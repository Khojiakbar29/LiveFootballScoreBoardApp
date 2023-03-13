package com.example.livefootballscoreboardapp.model;

import java.util.*;

public class ScoreBoard {
    private List<Game> activeGames;

    public ScoreBoard() {
        activeGames = new ArrayList<>();
    }

    public void addNewGame(String homeTeam, String awayTeam) {
        Game g = new Game(homeTeam, awayTeam);
        activeGames.add(g);
    }

    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Game g = findGame(homeTeam, awayTeam);
        g.setHomeScore(homeScore);
        g.setAwayScore(awayScore);
    }

    public void endGame(String homeTeam, String awayTeam) {
        Game g = findGame(homeTeam, awayTeam);
        activeGames.remove(g);
    }

    public List<Game> getGames() {
        List<Game> sum = new ArrayList<>(activeGames);

        Collections.sort(sum, new Comparator <Game>() {

            @Override
            public int compare(Game o1, Game o2) {
                int score1 = o1.getHomeScore() + o1.getAwayScore();
                int score2 = o2.getHomeScore() + o2.getAwayScore();

                if (score1 != score2) {
                    return score2 - score1;
                } else {
                    return o2.getStartTime().compareTo(o1.getStartTime());
                }
            }
        });
        return sum;
    }

    private Game findGame(String homeTeam, String awayTeam) {
        for (Game g : activeGames) {
            if (g.getHomeTeam().equals(homeTeam) && g.getAwayTeam().equals(awayTeam)) {
                return g;
            }
        }
        throw new RuntimeException("There is no requested game!");
    }
}
