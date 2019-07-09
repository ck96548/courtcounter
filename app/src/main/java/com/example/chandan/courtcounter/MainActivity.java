package com.example.chandan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

     /*
       display the score of team A

     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_for_teamA);
        scoreView.setText(String.valueOf(score));
    }
     /*
       increase the scrore for team A by two points

     */

     public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);

        }

    /*
    increase the scrore for team A by three points
    */

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);

    }

     /*
       increase the scrore for team A by 1 points

     */

    public void addOneForTeamA(View view) {

        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);


    }
 /*
       Display the score of team B

     */


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_for_teamB);
        scoreView.setText(String.valueOf(score));

    }
 /*
       increase the scrore for team b by 3 points

     */

    public void addThreeForTeamB(View view) {

        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);


    }
 /*
       increase the scrore for team b by 1 points

     */


    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);


    }
     /*
       increase the scrore for team A by two points

     */


    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);


    }
 /*
       the score of both team is zero

     */


    public void addReset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


}
