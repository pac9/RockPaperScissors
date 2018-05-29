package com.example.ruairidhgrass.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;

//
//    @Test
//    public void canGetPlayerChoice(){
//        game = new Game();
//        assertEquals("Rock", game.getPlayerChoice("Rock"));
//        assertEquals("Paper", game.getPlayerChoice("Paper"));
//    }

    @Test
    public void canPlayGame(){
        game = new Game();
        assertEquals("You Win!", game.playGame("Paper"));
    }

}
