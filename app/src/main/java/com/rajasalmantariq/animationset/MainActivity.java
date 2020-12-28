package com.rajasalmantariq.animationset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvI, tvS, tvB, tvN, tv1, tv2, tv3, tv4,
                tv5, tv6, tv7;

    Animation animShelf, animPhn, animAim, animDet,
                _i, _s, _b, _n, _1, _2;

    ImageView bookshelf, phone, aim, detect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        loadAnimations();           // load the animation files into relevant animation objects.

        setAnimatables();           // set objects to be animated (animatables) i.e. Img Views
        setTV();                    // set ISBN textviews for animation within the "phone screen"

        setAnimationListeners();    // listeners for animation objects, needed for synchronization
                                      // (i.e. views' visibilities)

        setAnimToAnimatables();     // set loaded animations to animatables
        setAnimToTV();              // set loaded animations for the ISBN textviews

    }

    private void setAnimToAnimatables() {
        bookshelf.setAnimation(animShelf);
        phone.setAnimation(animPhn);
        aim.setAnimation(animAim);
        detect.setAnimation(animDet);
    }

    private void setAnimationListeners() {
        animShelf.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bookshelf.setVisibility(View.INVISIBLE);
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

    }

    private void setAnimatables() {
        bookshelf= findViewById(R.id.bookshelf);
        phone= findViewById(R.id.cellIcon);
        aim= findViewById(R.id.aim);
        detect= findViewById(R.id.detect);
    }

    private void loadAnimations() {
        // animations for shelf, phone, etc.
        animShelf= AnimationUtils.loadAnimation(this, R.anim.bookzoom);
        animPhn= AnimationUtils.loadAnimation(this, R.anim.phonerising);
        animAim= AnimationUtils.loadAnimation(this, R.anim.aim_in_out);
        animDet= AnimationUtils.loadAnimation(this, R.anim.detect_in_out);

        // animation for ISBN textviews
        _i= AnimationUtils.loadAnimation(this,R.anim._i);
        _s= AnimationUtils.loadAnimation(this,R.anim._s);
        _b= AnimationUtils.loadAnimation(this,R.anim._b);
        _n= AnimationUtils.loadAnimation(this,R.anim._n);
        _1= AnimationUtils.loadAnimation(this, R.anim._1);
        _2= AnimationUtils.loadAnimation(this, R.anim._2);

    }

    private void setAnimToTV() {

        tv1.setAnimation(_i);
        tv2.setAnimation(_s);
        tv3.setAnimation(_b);
        tv4.setAnimation(_n);
        tv5.setAnimation(_1);
        tv6.setAnimation(_2);
        tv7.setAnimation(_i);
        tvI.setAnimation(_n);
        tvS.setAnimation(_s);
        tvB.setAnimation(_2);
        tvN.setAnimation(_n);
    }

    private void setTV() {
        tvI=findViewById(R.id.tvI);
                tvS= findViewById(R.id.tvS);
                tvB= findViewById(R.id.tvB);
                tvN= findViewById(R.id.tvN);
                tv1= findViewById(R.id.tv1);
                tv2= findViewById(R.id.tv2);
                tv3= findViewById(R.id.tv3);
                tv4= findViewById(R.id.tv4);
                tv5= findViewById(R.id.tv5);
                tv6= findViewById(R.id.tv6);
                tv7= findViewById(R.id.tv7);
    }
}