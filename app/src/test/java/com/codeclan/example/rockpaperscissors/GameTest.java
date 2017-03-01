package com.codeclan.example.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.rockpaperscissors.MoveSet.*;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 01/03/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @Test
    public void computerChoosesRandomEnum() {
        MoveSet move = game.computerPicksRandom();
        String answer = null;
        if (move.equals(ROCK) || move.equals(PAPER) || move.equals(SCISSORS)) {
            answer = "True";
        }
        assertNotNull(answer);
    }

    @Test
    public void testChoosingRockElicitsResponse(){
        assertNotNull(game.playerPicksRock());
    }

    @Test
    public void testChoosingPaperElicitsResponse(){
        assertNotNull(game.playerPicksPaper());
    }

    @Test
    public void testChoosingScissorsElicitsResponse(){
        assertNotNull(game.playerPicksScissors());
    }

}
