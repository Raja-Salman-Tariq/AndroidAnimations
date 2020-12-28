package com.rajasalmantariq.animationset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvI, tvS, tvB, tvN, tv1, tv2, tv3, tv4,
                tv5, tv6, tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Animation animShelf= AnimationUtils.loadAnimation(this, R.anim.bookzoom);
        Animation animPhn= AnimationUtils.loadAnimation(this, R.anim.phonerising);
        Animation animAim= AnimationUtils.loadAnimation(this, R.anim.aim_in_out);
        Animation animDet= AnimationUtils.loadAnimation(this, R.anim.detect_in_out);

        final ImageView bookshelf= findViewById(R.id.bookshelf);
        final ImageView phone= findViewById(R.id.cellIcon);
        final ImageView aim= findViewById(R.id.aim);
        final ImageView detect= findViewById(R.id.detect);

        setTV();

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

        bookshelf.setAnimation(animShelf);
        phone.setAnimation(animPhn);
        aim.setAnimation(animAim);
        detect.setAnimation(animDet);


        setAnimToTV();

    }

    private void setAnimToTV() {
        Animation _i= AnimationUtils.loadAnimation(this,R.anim._i);
        Animation _s= AnimationUtils.loadAnimation(this,R.anim._s);
        Animation _b= AnimationUtils.loadAnimation(this,R.anim._b);
        Animation _n= AnimationUtils.loadAnimation(this,R.anim._n);
        Animation _1= AnimationUtils.loadAnimation(this, R.anim._1);
        Animation _2= AnimationUtils.loadAnimation(this, R.anim._2);

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