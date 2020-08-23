package com.aswal.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Decline extends AppCompatActivity {

    TextView intropage, subintropage, fitonetitle, fitonedesc, timerValue, btnexercise;

    private static final long START_TIME_IN_MILLIS = 800000;
    private CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    Animation btthree, bttfour,tbbone, tbbtwo, alphagogo, bttone, bttwo;

    View divpage, bgprogress;

    ImageView imgtimer;

    LinearLayout fitone;

    MediaPlayer player;
    public int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decline);

        //load animations
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        tbbone = AnimationUtils.loadAnimation(this, R.anim.tbbone);
        tbbtwo = AnimationUtils.loadAnimation(this, R.anim.tbbtwo);
        alphagogo = AnimationUtils.loadAnimation(this, R.anim.alphagogo);
        bttone = AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);

        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);
        timerValue = (TextView) findViewById(R.id.timerValue);
        imgtimer = (ImageView)findViewById(R.id.imgtimer);

        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);
        fitone = (LinearLayout) findViewById(R.id.fitone);

        player = MediaPlayer.create(this, R.raw.heathens);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);

        //assign ANimation
        btnexercise.startAnimation(tbbtwo);
        bgprogress.startAnimation(tbbtwo);
        fitone.startAnimation(tbbone);
        intropage.startAnimation(tbbone);
        subintropage.startAnimation(tbbone);
        divpage.startAnimation(tbbtwo);
        timerValue.startAnimation(bttone);
        imgtimer.startAnimation(bttone);




        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnexercise.setEnabled(false);
                //bgprogress.setBackgroundColor(Color.parseColor("#FFFFFF"));
                startTimer();
            }
        });

    }


    private void startTimer() {
        player.start();
        if(flag == 0){
            btnexercise.setText("ROUND 1");
        }

        if(flag == 1){
            btnexercise.setText("ROUND 2");
        }

        if(flag == 2){
            btnexercise.setText("FINAL ROUND");
        }
        countDownTimer = new CountDownTimer(32000, 1000) {
            public void onTick(long millisUntilFinished) {

                if((millisUntilFinished/1000)>30)
                    timerValue.setText("START");

                else if((millisUntilFinished/1000)<10)
                    timerValue.setText("00:0" + millisUntilFinished / 1000);

                else timerValue.setText("00:" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //timerValue.setText("DONE");
                btnexercise.setText("IT'S A BREAK");
                flag++;
                if(flag==3)
                {
                    btnexercise.setEnabled(true);
                    imgtimer.setEnabled(false);
                    // bgprogress.setBackgroundColor(Color.parseColor("#000000"));
                    timerValue.setText("GOOD JOB!");
                    btnexercise.setText("NEXT");
                    player.stop();

                    btnexercise.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Decline.this, Tension.class);
                            startActivity(intent);
                        }
                    });
                }
                else
                {
                    player.pause();
                    startTimer2();
                }

            }
        }.start();

    }


    private void startTimer2() {
        countDownTimer = new CountDownTimer(32000, 1000) {
            public void onTick(long millisUntilFinished) {
                if((millisUntilFinished/1000)>30 )
                    timerValue.setText("WAIT");

                else if((millisUntilFinished/1000)<10)
                    timerValue.setText("00:0" + millisUntilFinished / 1000);

                else timerValue.setText("00:" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                timerValue.setText("START");
                //btnexercise.setText("GOOD GOING");
                if(flag<3) {

                    startTimer();
                }




            }
        }.start();
    }


}
