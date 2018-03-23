package com.emakina.iclu.generalapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iclu on 23/03/2018.
 */

public class FadeAnimation {

    TextView blobText;
    ImageView catView;
    public int position = 0;
    Animation fadeInAnimationObject;
    Animation textDisplayAnimationObject;
    Animation delayBetweenAnimations;
    Animation fadeOutAnimationObject;
    int fadeEffectDuration;
    int delayDuration;
    int displayFor;

    public FadeAnimation(TextView textV, ImageView imageC) {
        this(textV, imageC, 500, 500, 1000);
    }

    public FadeAnimation(TextView textView,
                         ImageView imageView,
                         int fadeEffectDuration,
                         int delayDuration,
                         int displayLength) {
        blobText = textView;
        catView = imageView;
        this.fadeEffectDuration = fadeEffectDuration;
        this.delayDuration = delayDuration;
        this.displayFor = displayLength;
        InitializeAnimation();
    }

    private void InitializeAnimation() {
        fadeInAnimationObject = new AlphaAnimation(0f, 1f);
        fadeInAnimationObject.setDuration(fadeEffectDuration);

        textDisplayAnimationObject = new AlphaAnimation(1f, 1f);
        textDisplayAnimationObject.setDuration(displayFor);

        delayBetweenAnimations = new AlphaAnimation(0f, 0f);
        delayBetweenAnimations.setDuration(delayDuration);

        fadeOutAnimationObject = new AlphaAnimation(1f, 0f);
        fadeOutAnimationObject.setDuration(fadeEffectDuration);

        fadeInAnimationObject.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                position++;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                blobText.startAnimation(textDisplayAnimationObject);
                catView.startAnimation(textDisplayAnimationObject);
            }
        });

        textDisplayAnimationObject.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                blobText.startAnimation(fadeOutAnimationObject);
                catView.startAnimation(fadeOutAnimationObject);
            }
        });

        fadeOutAnimationObject.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                blobText.startAnimation(delayBetweenAnimations);
                catView.startAnimation(delayBetweenAnimations);
            }
        });

        delayBetweenAnimations.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                blobText.startAnimation(fadeInAnimationObject);
                catView.startAnimation(fadeInAnimationObject);
            }
        });
    }

    public void startAnimation() {
        blobText.startAnimation(fadeOutAnimationObject);
        catView.startAnimation(fadeOutAnimationObject);
    }


}
