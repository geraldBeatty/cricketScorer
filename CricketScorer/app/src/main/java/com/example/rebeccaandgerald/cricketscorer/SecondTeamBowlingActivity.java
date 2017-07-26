package com.example.rebeccaandgerald.cricketscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondTeamBowlingActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bowling_two);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SecondTeamBowlingFragment())
                .commit();
    }
}