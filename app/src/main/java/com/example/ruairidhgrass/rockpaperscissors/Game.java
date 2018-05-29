package com.example.ruairidhgrass.rockpaperscissors;

import android.util.Log;

public class Game {

    Generator generator;

    public Game() {
        this.generator = new Generator();
    }

//    public String getPlayerChoice(String choice) {
//        return choice;
//    }

    public String playGame(String playerChoice) {
        String random = generator.getRandomMove();

        if ((playerChoice == "Rock") && (random == "Scissors")){
            return "Computer picked Scissors, You Win!";
        }else if ((playerChoice == "Rock") && (random == "Paper")){
            return "Computer picked Paper, You Lose!";
        }else if ((playerChoice == "Rock") && (random == "Lizard")){
            return "Computer picked Lizard, You Win!";
        }else if ((playerChoice == "Rock") && (random == "Spock")){
            return "Computer picked Spock, You Lose!";
        }


        else if ((playerChoice == "Paper") && (random == "Rock")){
            return "Computer picked Rock, You Win!";
        }else if ((playerChoice == "Paper") && (random == "Scissors")){
            return "Computer picked Scissors, You Lose!";
        }else if ((playerChoice == "Paper") && (random == "Lizard")){
            return "Computer picked Lizard, You Lose!";
        }else if ((playerChoice == "Paper") && (random == "Spock")){
            return "Computer picked Spock, You Win!";
        }


        else if ((playerChoice == "Scissors") && (random == "Lizard")){
            return "Computer picked Lizard, You Win!";
        }else if ((playerChoice == "Scissors") && (random == "Spock")){
            return "Computer picked Spock, You Lose!";
        } else if ((playerChoice == "Scissors") && (random == "Rock")){
            return "Computer picked Rock, You Lose!";
        } else if ((playerChoice == "Scissors") && (random == "Paper")){
            return "Computer picked Paper, You Win!";
        }

        else if ((playerChoice == "Lizard") && (random == "Paper")){
            return "Computer picked Paper, You Win!";
        }else if ((playerChoice == "Lizard") && (random == "Spock")){
            return "Computer picked Spock, You Win!";
        }else if ((playerChoice == "Lizard") && (random == "Scissors")){
            return "Computer picked Scissors, You Lose!";
        }else if ((playerChoice == "Lizard") && (random == "Rock")){
            return "Computer picked Rock, You Lose!";
        }

        else if ((playerChoice == "Spock") && (random == "Paper")){
            return "Computer picked Paper, You Lose!";
        }else if ((playerChoice == "Spock") && (random == "Rock")){
            return "Computer picked Rock, You Win!";
        }else if ((playerChoice == "Spock") && (random == "Scissors")){
            return "Computer picked Scissors, You WIn!";
        }else if ((playerChoice == "Spock") && (random == "Lizard")){
            return "Computer picked Lizard, You Lose!";
        }

        else {
            System.out.println("player: " + playerChoice + "Comp: " + random);
            return "Draw";}
    }
}


