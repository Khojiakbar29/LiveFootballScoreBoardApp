package com.example.livefootballscoreboardapp.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreBoardTest {
    private ScoreBoard sb;

    @BeforeEach
    public void setUp() {
        sb = new ScoreBoard();
    }

    @Test
    public void testAddGame() {
        sb.addNewGame("Poland", "Holland");
        Assertions.assertEquals(1, sb.getGames().size());
        Assertions.assertEquals("Poland", sb.getGames().get(0).getHomeTeam());
        Assertions.assertEquals("Holland", sb.getGames().get(0).getAwayTeam());
    }

    @Test
    public void testUpdateScore() {
        sb.addNewGame("Poland", "Holland");
        sb.updateScore("Poland", "Holland", 2 , 1);
        Assertions.assertEquals(2, sb.getGames().get(0).getHomeScore());
        Assertions.assertEquals(1, sb.getGames().get(0).getAwayScore());
    }

    @Test
    public void testEndGame() {
        sb.addNewGame("Poland", "Holland");
        sb.endGame("Poland", "Holland");
        Assertions.assertEquals(0, sb.getGames().size());
    }

    @Test
    public void testGetGames() {
        sb.addNewGame("Poland", "Holland");
        sb.addNewGame("France", "Italy");
        sb.addNewGame("Portugal", "Spain");

        sb.updateScore("Poland", "Holland", 2, 1);
        sb.updateScore("France", "Italy", 1, 1);
        sb.updateScore("Portugal", "Spain", 0, 0);

        sb.endGame("France", "Italy");

        Assertions.assertEquals("Poland", sb.getGames().get(0).getHomeTeam());
        Assertions.assertEquals("Holland", sb.getGames().get(0).getAwayTeam());
        Assertions.assertEquals(2, sb.getGames().get(0).getHomeScore());
        Assertions.assertEquals(1, sb.getGames().get(0).getAwayScore());

        Assertions.assertEquals("Portugal", sb.getGames().get(1).getHomeTeam());
        Assertions.assertEquals("Spain", sb.getGames().get(1).getAwayTeam());
        Assertions.assertEquals(0, sb.getGames().get(1).getHomeScore());
        Assertions.assertEquals(0, sb.getGames().get(1).getAwayScore());

    }
}
