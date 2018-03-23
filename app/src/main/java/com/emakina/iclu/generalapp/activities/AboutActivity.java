package com.emakina.iclu.generalapp.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.emakina.iclu.generalapp.FadeAnimation;
import com.emakina.iclu.generalapp.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView introText = findViewById(R.id.txt_about);
        ImageView catImage = findViewById(R.id.img_about);

        catImage.setOnClickListener(this);

        FadeAnimation animator = new FadeAnimation(introText, catImage);
        animator.startAnimation();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_woaw) {
            Toast.makeText(AboutActivity.this, R.string.heart_clicked, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_about:
                startAnimation();
                break;
        }
    }

    private void startAnimation() {
        ImageView imageView = findViewById(R.id.img_about);
        /*ObjectAnimator animateImageView =
                ObjectAnimator.ofFloat(imageView, "translationY", 0f, 500f);
        animateImageView.setDuration(2000);
        animateImageView.setInterpolator(new AccelerateDecelerateInterpolator());
        animateImageView.start();*/ //Animation qui fait descendre mon imgview

        ObjectAnimator rotationAnimator =
                ObjectAnimator.ofFloat(imageView, "rotation", 360f);
        rotationAnimator.setDuration(2000);

        ObjectAnimator translateAnimator =
                ObjectAnimator.ofFloat(imageView, "translationY", 500f);
        translateAnimator.setDuration(2000);

        AnimatorSet set = new AnimatorSet();
        set.playTogether(rotationAnimator, translateAnimator);
        set.start();
    }

}
