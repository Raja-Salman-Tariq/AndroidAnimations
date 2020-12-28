package com.rajasalmantariq.animationset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class BarcodeScanning extends AppCompatActivity {

    Animation bookFadeIn,phoneMovement,barcodeScanning,popUpMovement;

    ImageView book,phone,scanningBox,popUp;

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
        phoneMovement= AnimationUtils.loadAnimation(this, R.anim.phone_movement);
        barcodeScanning= AnimationUtils.loadAnimation(this, R.anim.barcode_scanning);
        popUpMovement= AnimationUtils.loadAnimation(this, R.anim.pop_up_movement);
    }

    private void setAnimatables() {
        book = findViewById(R.id.barcoded_book);
        phone= findViewById(R.id.cellIcon_barcode_scanning);
        scanningBox= findViewById(R.id.scanning);
        popUp= findViewById(R.id.pop_up);
    }

    private void setAnimToAnimatables() {
        book.setAnimation(bookFadeIn);
        phone.setAnimation(phoneMovement);
        scanningBox.setAnimation(barcodeScanning);
        popUp.setAnimation(popUpMovement);
    }

    private void setAnimationListeners() {
        bookFadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
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

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}