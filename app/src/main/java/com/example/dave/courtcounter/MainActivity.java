package com.example.dave.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for sacremento
    int scoreTeamSacremento = 0;

    //Tracks the score for Golden State
    int scoreTeamGoldenState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score of Sacremento by 3 points
     */
    public void addThreeForSacremento(View v) {
        scoreTeamSacremento = scoreTeamSacremento + 3;
        displayForSacremento(scoreTeamSacremento);
    }
    /**
     * Increase the score of Sacremento by 2 points
     */
    public void addTwoForSacremento(View v) {
        scoreTeamSacremento = scoreTeamSacremento + 2;
        displayForSacremento(scoreTeamSacremento);
    }
    /**
     * Increase the score of Sacremento by 1 point
     */
    public void addOneForSacremento(View v) {
        scoreTeamSacremento = scoreTeamSacremento + 1;
        displayForSacremento(scoreTeamSacremento);

    }
    /**
     * Increase the score of Golden state by 3 points
     */
    public void addThreeForGoldenState(View v) {
        scoreTeamGoldenState = scoreTeamGoldenState + 3;
        displayForGoldenstate(scoreTeamGoldenState);
    }
    /**
     * Increase the score of Golden state by 2 points
     */
    public void addTwoForGoldenState(View v) {
        scoreTeamGoldenState = scoreTeamGoldenState + 2;
        displayForGoldenstate(scoreTeamGoldenState);
    }
    /**
     * Increase the score of Sacremento by 1 point
     */
    public void addOneForGoldenState(View v) {
        scoreTeamGoldenState = scoreTeamGoldenState + 1;
        displayForGoldenstate(scoreTeamGoldenState);
    }

    public void scoreReset(View v) {
        scoreTeamSacremento = 0;
        scoreTeamGoldenState = 0;
        displayForSacremento(scoreTeamSacremento);
        displayForGoldenstate(scoreTeamGoldenState);
    }
    /**
     * Displays the given score for Sacremento
     */
    public void displayForSacremento(int score){
        TextView scoreView= (TextView) findViewById(R.id.Sacremento_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForGoldenstate(int score){
        TextView scoreView= (TextView) findViewById(R.id.Sacremento_score);
        scoreView.setText(String.valueOf(score));
    }
}