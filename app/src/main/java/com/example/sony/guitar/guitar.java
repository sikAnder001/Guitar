package com.example.sony.guitar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class guitar extends AppCompatActivity {



    Button s1, s2, s3, s4, s5, s6;

//    public void onClick(View v) {
//
//        s1 = (Button) findViewById(R.id.s1);
//        s2 = (Button) findViewById(R.id.s2);
//        s3 = (Button) findViewById(R.id.s3);
//        s4 = (Button) findViewById(R.id.s4);
//        s5 = (Button) findViewById(R.id.s5);
//        s6 = (Button) findViewById(R.id.s6);
//
//        final MediaPlayer m1 = MediaPlayer.create(this, R.raw.so1);
//        final MediaPlayer m2 = MediaPlayer.create(this, R.raw.so2);
//        final MediaPlayer m3 = MediaPlayer.create(this, R.raw.so3);
//        final MediaPlayer m4 = MediaPlayer.create(this, R.raw.so4);
//        final MediaPlayer m5 = MediaPlayer.create(this, R.raw.so5);
//        final MediaPlayer m6 = MediaPlayer.create(this, R.raw.so6);
//
//
//        d1 = (Button) findViewById(R.id.d1);
//        d2 = (Button) findViewById(R.id.d2);
//        d3 = (Button) findViewById(R.id.d3);
//        d4 = (Button) findViewById(R.id.d4);
//        d5 = (Button) findViewById(R.id.d5);
//        d6 = (Button) findViewById(R.id.d6);
//
//        if (v.getId() == R.id.d1 && v.getId() == R.id.s1) {
//            m1.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView);
//            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom);
//            image.startAnimation(animation1);
//
//        } else if (v.getId() == R.id.d2 && v.getId() == R.id.s2) {
//            m2.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView5);
//            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom1);
//            image.startAnimation(animation2);
//
//        } else if (v.getId() == R.id.d3 && v.getId() == R.id.s3) {
//            m3.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView6);
//            Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom2);
//            image.startAnimation(animation3);
//
//        } else if (v.getId() == R.id.d4 && v.getId() == R.id.s4) {
//            m4.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView7);
//            Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom3);
//            image.startAnimation(animation4);
//
//        } else if (v.getId() == R.id.d5 && v.getId() == R.id.s5) {
//            m5.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView8);
//            Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom4);
//            image.startAnimation(animation5);
//
//        } else if (v.getId() == R.id.d6 && v.getId() == R.id.s6) {
//            m6.start();
//            ImageView image = (ImageView) findViewById(R.id.imageView9);
//            Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(),
//                    R.anim.zoom5);
//            image.startAnimation(animation6);
//
//        } else {
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.f1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.f2);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.f3);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.f4);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.f5);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.f6);

        s1 = (Button) findViewById(R.id.s1);
        s2 = (Button) findViewById(R.id.s2);
        s3 = (Button) findViewById(R.id.s3);
        s4 = (Button) findViewById(R.id.s4);
        s5 = (Button) findViewById(R.id.s5);
        s6 = (Button) findViewById(R.id.s6);

        s1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp1.start();
                    ImageView image = (ImageView) findViewById(R.id.imageView);
                    Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom);
                    image.startAnimation(animation1);

                    return true;

                }

                return false;
            }
        });


        s2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp2.start();

                    ImageView image = (ImageView) findViewById(R.id.imageView5);
                    Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom1);
                    image.startAnimation(animation2);

                    return true;

                }
                return false;
            }
        });


        s3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp3.start();
                    ImageView image = (ImageView) findViewById(R.id.imageView6);
                    Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom2);
                    image.startAnimation(animation3);

                        return true;

                }
                return false;
            }
        });


        s4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp4.start();
                    ImageView image = (ImageView) findViewById(R.id.imageView7);
                    Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom3);
                    image.startAnimation(animation4);

                    return true;
                }
                return false;
            }
        });


        s5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp5.start();

                    ImageView image = (ImageView) findViewById(R.id.imageView8);
                    Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom4);
                    image.startAnimation(animation5);
                    return true;
                }
                return false;
            }
        });


        s6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    mp6.start();
                    ImageView image = (ImageView) findViewById(R.id.imageView9);
                    Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.zoom5);
                    image.startAnimation(animation6);

                    return true;
                }
                return false;
            }
        });
    }

}
