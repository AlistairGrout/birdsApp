package com.emakina.iclu.generalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.emakina.iclu.generalapp.R;

public class BigBirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_bird);

        Button btnMagical = findViewById(R.id.btn_magical);
        Button btnPlague = findViewById(R.id.btn_plague);
        Button btnVermillion = findViewById(R.id.btn_vermillion);
        Button btnImage = findViewById(R.id.btn_image_shit);

        btnMagical.setOnClickListener(this);
        btnPlague.setOnClickListener(this);
        btnVermillion.setOnClickListener(this);
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
        switch (view.getId()) {
            case R.id.btn_magical:
                startMagicalStory();
                break;
            case R.id.btn_plague:
                startPlagueStory();
                break;
            case R.id.btn_vermillion:
                startVermillionStory();
                break;
            case R.id.btn_image_shit:
                showImage();
                break;
        }
    }

    private void startMagicalStory() {
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startPlagueStory() {
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startVermillionStory() {
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void showImage() {

    }
}
