package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RulesActivity extends AppCompatActivity {

    TextView rulesDisplay;
    Button playNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        rulesDisplay = (TextView)findViewById(R.id.rules_explanation);
        playNow = (Button) findViewById(R.id.play_now_button);

        rulesDisplay.setText("Welcome to this awesome Rock, Paper, Scissors game. \n\n" +
                "Here are the rules:\n\n" +
                "Choose either Rock, Paper or Scissors at random, and hope that your guess is right!");


    }

    public void beginGame(View button) {
        Intent intent = new Intent(this, SelectMove.class);

        startActivity(intent);
    }
}

