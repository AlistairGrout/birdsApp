package com.emakina.iclu.generalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.emakina.iclu.generalapp.R;

public class MediumBirdActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_bird);

        Button btnAngery = findViewById(R.id.btn_angery);
        Button btnBaptism = findViewById(R.id.btn_baptism);
        Button btnCrimewave = findViewById(R.id.btn_crimewave);
        Button btnImage = findViewById(R.id.btn_image_shit);

        btnAngery.setOnClickListener(this);
        btnBaptism.setOnClickListener(this);
        btnCrimewave.setOnClickListener(this);
        btnImage.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_angery:
                startAngeryStory();
                break;
            case R.id.btn_baptism:
                startBaptismStory();
                break;
            case R.id.btn_crimewave:
                startCrimewaveStory();
                break;
            case R.id.btn_image_shit:
                showImage();
                break;
        }
    }

    private void startAngeryStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startBaptismStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startCrimewaveStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void showImage(){

    }
}
