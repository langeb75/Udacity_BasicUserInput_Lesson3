package com.example.lesson3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Declare a global variable for Team A Score
    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Adds One Point to Team A's Score
     */
    public void addOnePointTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayScoreForTeamA(teamAScore);
    }

    /**
     * Adds Two Points to Team A's Score
     */
    public void addTwoPointsTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayScoreForTeamA(teamAScore);
    }

    /**
     * Adds Three Points to Team A's Score
     */
    public void addThreePointsTeamA(View v) {
        teamAScore = teamAScore + 3;
        displayScoreForTeamA(teamAScore);
    }

     /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



}