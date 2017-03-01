package com.codeclan.example.rockpaperscissors;

import java.util.Random;

import static com.codeclan.example.rockpaperscissors.MoveSet.*;

/**
 * Created by user on 01/03/2017.
 */

public class Game {

    private MoveSet[] options;

    public Game(){
        options = new MoveSet[3];
        options[0] = ROCK;
        options[1] = PAPER;
        options[2] = SCISSORS;
    }

    public MoveSet computerPicksRandom(){
        Random rand = new Random();
        int computerRand = rand.nextInt(options.length);

        return options[computerRand];
    }

    public String playerPicksRock(){
        MoveSet computer = computerPicksRandom();
        String result = null;

        switch(computer){
            case ROCK:
                result = "Your rock bashes together with my rock but both remain undamaged. DRAW!";
                break;
            case PAPER:
                result = "Your rock is enveloped by my leaf of paper. I smirk at you, for you have lost.";
                break;
            case SCISSORS:
                result = "Your rock blunts my scissors sending sparks a-flying in the process! You win this time!";
                break;
        }

        return result;
    }

    public String playerPicksPaper(){
        MoveSet computer = computerPicksRandom();
        String result = null;

        switch(computer){
            case ROCK:
                result = "Your paper wraps my rock with an air of smug self satisfaction! You bask in the glory of victory! QAPLA!!";
                break;
            case PAPER:
                result = "Both of our pieces of paper sneer at each other to little avail. DRAW!";
                break;
            case SCISSORS:
                result = "With a casual snip, my scissors cut your paper. Better luck next time, monkey brain!";
                break;
        }

        return result;
    }

    public String playerPicksScissors(){
        MoveSet computer = computerPicksRandom();
        String result = null;

        switch(computer){
            case ROCK:
                result = "My rock blunts your scissors sending sparks a-flying! You hang your head, dejected in defeat!";
                break;
            case PAPER:
                result = "With a casual snip, your scissors cut my paper. You have prevailed!";
                break;
            case SCISSORS:
                result = "Lacking a suitable way to interface with each other, our scissors have little effect upon one another. DRAW!";
                break;
        }

        return result;
    }
}
