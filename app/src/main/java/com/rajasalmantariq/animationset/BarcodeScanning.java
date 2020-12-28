package com.rajasalmantariq.animationset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BarcodeScanning extends AppCompatActivity {

    Animation bookFadeIn,bookZoom,phoneMovement,barcodeScanning,popUpMovement,instructionFade_1,instructionFade_2,instructionFade_3;

    ImageView book,phone,scanningBox,popUp;

    TextView instructions_1,instructions_2,instructions_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_scanning);
        getSupportActionBar().hide();

        loadAnimations();       // load the animation files into relevant animation objects.

        setAnimatables();       // set objects to be animated (animatables) i.e. Img Views

        setAnimationListeners();    // listeners for animation objects, needed for synchronization
                                    // (i.e. views' visibilities)

        setAnimToAnimatables();     // set loaded animations to animatables

    }

    private void loadAnimations() {
        bookFadeIn= AnimationUtils.loadAnimation(this, R.anim.barcoded_book_appear);
        bookZoom= AnimationUtils.loadAnimation(this, R.anim.barcoded_book_zoom);
        phoneMovement= AnimationUtils.loadAnimation(this, R.anim.phone_movement);
        barcodeScanning= AnimationUtils.loadAnimation(this, R.anim.barcode_scanning);
        popUpMovement= AnimationUtils.loadAnimation(this, R.anim.pop_up_movement);
        instructionFade_1= AnimationUtils.loadAnimation(this, R.anim.instruction_fade);
        instructionFade_2= AnimationUtils.loadAnimation(this, R.anim.instruction_fade_2);
        instructionFade_3= AnimationUtils.loadAnimation(this, R.anim.instruction_fade_3);
    }

    private void setAnimatables() {
        book = findViewById(R.id.barcoded_book);
        phone= findViewById(R.id.cellIcon_barcode_scanning);
        scanningBox= findViewById(R.id.scanning);
        popUp= findViewById(R.id.pop_up);
        instructions_1= findViewById(R.id.instructions_1);
        instructions_2= findViewById(R.id.instructions_2);
        instructions_2.setVisibility(View.INVISIBLE);
        instructions_3= findViewById(R.id.instructions_3);
        instructions_3.setVisibility(View.INVISIBLE);
    }

    private void setAnimToAnimatables() {
        book.setAnimation(bookFadeIn);
        phone.setAnimation(phoneMovement);
        scanningBox.setAnimation(barcodeScanning);
        popUp.setAnimation(popUpMovement);
        instructions_1.setAnimation(instructionFade_1);
        instructions_2.setAnimation(instructionFade_2);
        instructions_3.setAnimation(instructionFade_3);
    }

    private void setAnimationListeners() {
        bookFadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                book.setAnimation(bookZoom);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        phoneMovement.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                phone.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        barcodeScanning.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                scanningBox.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        popUpMovement.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                popUp.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        bookZoom.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                book.setScaleX((float) 0);
                book.setScaleY((float) 0);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        instructionFade_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                instructions_1.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        instructionFade_2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                instructions_2.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        instructionFade_3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                instructions_3.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}