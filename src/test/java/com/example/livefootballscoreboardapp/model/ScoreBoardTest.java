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
}
