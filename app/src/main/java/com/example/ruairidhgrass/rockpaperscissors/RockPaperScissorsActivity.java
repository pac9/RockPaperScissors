package com.example.ruairidhgrass.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Button lizardButton;
    Button spockButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        lizardButton = findViewById(R.id.lizard_button);
        spockButton = findViewById(R.id.spock_button);
        result = findViewById(R.id.result_display);
    }

    public void onRockButtonClicked(View view){
        Game game = new Game();
        String answer = game.playGame("Rock");
        this.result.setText(answer);
    }

    public void onPaperButtonClicked(View view){
        Game game = new Game();
        String answer = game.playGame("Paper");
        this.result.setText(answer);
    }

    public void onScissorsButtonClicked(View view){
        Game game = new Game();
        String answer = game.playGame("Scissors");
        this.result.setText(answer);
    }

    public void onSpockButtonClicked(View view){
        Game game = new Game();
        String answer = game.playGame("Spock");
        this.result.setText(answer);
    }

    public void onLizardButtonClicked(View view){
        Game game = new Game();
        String answer = game.playGame("Lizard");
        this.result.setText(answer);
    }

}
