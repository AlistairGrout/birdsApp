package com.emakina.iclu.generalapp.activities;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.emakina.iclu.generalapp.R;

public class SmallBirdActivity extends AppCompatActivity implements View.OnClickListener{
    PopupWindow smallPopupWindow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_bird);

        Button btnDoe = findViewById(R.id.btn_doe);
        Button btnDeer = findViewById(R.id.btn_deer);
        Button btnKrappa = findViewById(R.id.btn_krappa);
        Button btnImage = findViewById(R.id.btn_image_shit);

        btnDoe.setOnClickListener(this);
        btnDeer.setOnClickListener(this);
        btnKrappa.setOnClickListener(this);
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
        switch(view.getId()){
            case R.id.btn_doe:
                startDoeStory();
                break;
            case R.id.btn_deer:
                startDeerStory();
                break;
            case R.id.btn_krappa:
                startKrappaStory();
                break;
            case R.id.btn_image_shit:
                showPopUp();
                break;
        }
    }
    private void startDoeStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startDeerStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void startKrappaStory(){
        Intent intent = new Intent(this, BirdStoryActivity.class);
        startActivity(intent);
    }

    private void showPopUp() {

    }
}
