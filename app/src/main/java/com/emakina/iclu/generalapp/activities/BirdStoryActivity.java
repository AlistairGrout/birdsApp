package com.emakina.iclu.generalapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.emakina.iclu.generalapp.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class BirdStoryActivity extends AppCompatActivity implements View.OnTouchListener {

    PhotoViewAttacher pAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_story);
        ImageView birdImage = findViewById(R.id.bird_story_img);
        birdImage.setOnTouchListener(this);

        pAttacher = new PhotoViewAttacher(birdImage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        pAttacher.update();
        return false;
    }
}
