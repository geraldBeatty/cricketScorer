package com.example.rebeccaandgerald.cricketscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class PrimaryPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primary);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PrimaryFragment())
                .commit();
    }
}
