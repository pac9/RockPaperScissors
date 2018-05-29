package com.example.ruairidhgrass.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratorTest {

    Generator generator;

    @Before
    public void before(){
        generator = new Generator();
    }

    @Test
    public void canCountMoves(){
        assertEquals(3, generator.countMoves() );
    }

    @Test
    public void canGetRandomMove(){
        assertNotNull(generator.getRandomMove());
    }


}
