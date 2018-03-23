package com.emakina.iclu.generalapp.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.emakina.iclu.generalapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBigBird = findViewById(R.id.btn_big);
        Button btnMediumBird = findViewById(R.id.btn_medium);
        Button btnSmallBird = findViewById(R.id.btn_small);
        Button btnMagicalShit = findViewById(R.id.btn_magical_shit);
        Switch switchAbout = findViewById(R.id.switch_btn);

        btnBigBird.setOnClickListener(this);
        btnMediumBird.setOnClickListener(this);
        btnSmallBird.setOnClickListener(this);
        btnMagicalShit.setOnClickListener(this);
        switchAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_big:
                startBigBirdMenu();
                break;
            case R.id.btn_medium:
                startMediumBirdMenu();
                break;
            case R.id.btn_small:
                startSmallBirdMenu();
                break;
            case R.id.btn_magical_shit:
                startMagicalShit();
                break;
            case R.id.switch_btn:
                startAbout();
                break;
        }
    }

    private void startBigBirdMenu() {
        Intent intent = new Intent(this, BigBirdActivity.class);
        startActivity(intent);
    }

    private void startMediumBirdMenu() {
        Intent intent = new Intent(this, MediumBirdActivity.class);
        startActivity(intent);
    }

    private void startSmallBirdMenu() {
        Intent intent = new Intent(this, SmallBirdActivity.class);
        startActivity(intent);
    }

    private void startMagicalShit() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.ad_title)
                .setMessage(R.string.ad_text)
                .setNegativeButton(R.string.ad_confirm, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onNegativePress();
                    }
                })
                .setPositiveButton(R.string.ad_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onPositivePress();
                    }
                })
                .create().show();
    }

    private void onPositivePress() {
        Toast.makeText(this, R.string.toast_positive_press, Toast.LENGTH_SHORT).show();
    }

    private void onNegativePress() {
        Toast.makeText(this, R.string.toast_negative_press, Toast.LENGTH_SHORT).show();
    }

    private void startAbout() {
        Log.i("bloblo", "ici probleme tf");
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
