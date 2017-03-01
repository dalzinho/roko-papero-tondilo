package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OutcomeActivity extends AppCompatActivity {

    TextView outcomeDescription;
    TextView playerChoice;
    TextView computerChoice;
    TextView runningScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outcome);

        outcomeDescription = (TextView)findViewById(R.id.outcome_view);
        playerChoice = (TextView)findViewById(R.id.outcome_player_choice);
        computerChoice = (TextView)findViewById(R.id.outcome_computer_choice);
        runningScore = (TextView)findViewById(R.id.running_score);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String the_result = extras.getString("game_outcome");
        String player = extras.getString("player_choice");
        String computer = extras.getString("computer_choice");
        String humanScore = "Human: " + Integer.toString(KeepCountOfScore.getHumanScore(this)) + " wins.";

        playerChoice.setText("You chose " + player + "!");
        computerChoice.setText("I chose " + computer + "!");
        outcomeDescription.setText(the_result);
        runningScore.setText(humanScore);
    }
}
