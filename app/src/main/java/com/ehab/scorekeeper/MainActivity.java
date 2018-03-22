package com.ehab.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Player player1, player2;
    TextView player1ScoreTextView;
    TextView player2ScoreTextView;
    TextView player1FoulsTextView;
    TextView player2FoulsTextView;

    Button addScoreP1Button;
    Button addScoreP2Button;
    Button addFoulP1Button;
    Button addFoulP2Button;
    Button resetGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = new Player(0, 0);
        player2 = new Player(0, 0);

        player1ScoreTextView = findViewById(R.id.player1ScoreTextView);
        player2ScoreTextView = findViewById(R.id.player2ScoreTextView);
        player1FoulsTextView = findViewById(R.id.player1FoulsTextView);
        player2FoulsTextView = findViewById(R.id.player2FoulsTextView);

        addScoreP1Button = findViewById(R.id.addScorePlayer1);
        addScoreP2Button = findViewById(R.id.addScorePlayer2);
        addFoulP1Button = findViewById(R.id.addFoulPlayer1);
        addFoulP2Button = findViewById(R.id.addFoulPlayer2);
        resetGameButton = findViewById(R.id.resetButton);

        player1ScoreTextView.setText(Integer.toString(player1.getScore()));
        player2ScoreTextView.setText(Integer.toString(player2.getScore()));

        player1FoulsTextView.setText(Integer.toString(player1.getFouls()));
        player2FoulsTextView.setText(Integer.toString(player2.getFouls()));

        addScoreP1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = player1.getScore();
                player1.setScore(++currentScore);
                player1ScoreTextView.setText(Integer.toString(player1.getScore()));
            }
        });

        addScoreP2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = player2.getScore();
                player2.setScore(++currentScore);
                player2ScoreTextView.setText(Integer.toString(player2.getScore()));
            }
        });

        addFoulP1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = player1.getFouls();
                player1.setFouls(++currentScore);
                player1FoulsTextView.setText(Integer.toString(player1.getFouls()));
            }
        });

        addFoulP2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentScore = player2.getFouls();
                player2.setFouls(++currentScore);
                player2FoulsTextView.setText(Integer.toString(player2.getFouls()));
            }
        });

        resetGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1 = new Player(0,0);
                player2 = new Player(0,0);
                player1ScoreTextView.setText(Integer.toString(player1.getScore()));
                player1FoulsTextView.setText(Integer.toString(player1.getFouls()));
                player2ScoreTextView.setText(Integer.toString(player2.getScore()));
                player2FoulsTextView.setText(Integer.toString(player2.getFouls()));
            }
        });

    }
}
