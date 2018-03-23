package com.emakina.iclu.generalapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.emakina.iclu.generalapp.R;

public class BirdStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_story);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }
}
