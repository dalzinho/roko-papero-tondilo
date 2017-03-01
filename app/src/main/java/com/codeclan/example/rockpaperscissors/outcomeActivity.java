package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class outcomeActivity extends AppCompatActivity {

    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outcome);

        outcome = (TextView)findViewById(R.id.outcome_view);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String the_result = extras.getString("game_outcome");

        outcome.setText(the_result);
    }
}
