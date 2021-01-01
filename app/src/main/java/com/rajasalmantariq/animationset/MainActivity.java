package com.rajasalmantariq.animationset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView isbn, detectedIsbn;

    TextView aim, detect;

    Animation animPhn, animAim, animDet, animBook,
                animIsbn, animScanning, animPopup, animScanned;

    ImageView phone, book, scanner, popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        setAnimatables();           // set objects to be animated (animatables) i.e. Img Views


        loadAnimations();           // load the animation files into relevant animation objects.


        setAnimationListeners();    // listeners for animation objects, needed for synchronization
                                      // (i.e. views' visibilities)

        setAnimToAnimatables();     // set loaded animations to animatables

    }

    private void setAnimToAnimatables() {
        phone.setAnimation(animPhn);
        aim.setAnimation(animAim);
        detect.setAnimation(animDet);
        book.setAnimation(animBook);
        isbn.setAnimation(animIsbn);
        scanner.setAnimation(animScanning);
        popup.setAnimation(animPopup);
        detectedIsbn.setAnimation(animScanned);
    }

    private void setAnimationListeners() {
        animScanned.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                detectedIsbn.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animPopup.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                popup.setVisibility(View.INVISIBLE);
                phone.setVisibility(View.INVISIBLE);
                startActivity(new Intent(MainActivity.this, BarcodeScanning.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animIsbn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                isbn.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animPhn.setAnimationListener(new Animation.AnimationListener() {
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

        animAim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                aim.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animDet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                detect.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animBook.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                book.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    private void setAnimatables() {
        book=findViewById(R.id.book);
        book.setVisibility(View.INVISIBLE);
        phone= findViewById(R.id.cellIcon);
        isbn=findViewById(R.id.isbn);
        isbn.setVisibility(View.INVISIBLE);
        scanner=findViewById(R.id.isdnscan);
        scanner.setVisibility(View.INVISIBLE);
        aim= findViewById(R.id.aim);
        detect= findViewById(R.id.detect);
        popup=findViewById(R.id.popup);
        popup.setVisibility(View.INVISIBLE);
        detectedIsbn=findViewById(R.id.isbndet);
        detectedIsbn.setVisibility(View.INVISIBLE);

    }

    private void loadAnimations() {
        animPhn= AnimationUtils.loadAnimation(this, R.anim.phonerising);
        animAim= AnimationUtils.loadAnimation(this, R.anim.aim_in_out);
        animDet= AnimationUtils.loadAnimation(this, R.anim.detect_in_out);
        animBook= AnimationUtils.loadAnimation(this, R.anim.isbnbook);
        animIsbn= AnimationUtils.loadAnimation(this, R.anim.isbnbook);
        animScanning= AnimationUtils.loadAnimation(this, R.anim.detect_in_out_isbn);
        animPopup= AnimationUtils.loadAnimation(this, R.anim.pop_up_movement);
        animScanned= AnimationUtils.loadAnimation(this, R.anim.scannedisbn);
    }

}