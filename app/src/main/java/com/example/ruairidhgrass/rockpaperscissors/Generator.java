package com.example.ruairidhgrass.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

public class Generator {

    private Random randomGenerator;
    ArrayList<String> moves;

    public Generator() {
        this.moves = new ArrayList<>();
        moves.add("Rock");
        moves.add("Paper");
        moves.add("Scissors");
        moves.add("Lizard");
        moves.add("Spock");
        randomGenerator = new Random();
    }


    public int countMoves() {
        return this.moves.size();
    }

    public String getRandomMove() {
        int index = randomGenerator.nextInt(5);
        String move = moves.get(index);
        return move;
    }

}