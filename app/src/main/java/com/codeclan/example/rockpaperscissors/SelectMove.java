package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMove extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_move);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);

        game = new Game();
    }

    public void handleClick(View button) {
        String outcome = null;
        String player_choice = null;

        switch (button.getId()) {
            case R.id.rock_button:
                outcome = game.playerPicksRock();
                player_choice = "Rock";
                break;
            case R.id.paper_button:
                outcome = game.playerPicksPaper();
                player_choice = "Paper";
                break;
            case R.id.scissors_button:
                outcome = game.playerPicksScissors();
                player_choice = "Scissors";
                break;
        }

        if(game.getHumanWin()){
            KeepCountOfScore.incrementHumanScore(this);
        }

        if(game.getCpuWin()){
            KeepCountOfScore.incrementCPUScore(this);
        }

        game.setWinStatusesToFalse();

        Intent intent = new Intent(this, OutcomeActivity.class);
        intent.putExtra("player_choice", player_choice);
        intent.putExtra("computer_choice", game.getComputerChoice());
        intent.putExtra("game_outcome", outcome);

        startActivity(intent);
    }
}