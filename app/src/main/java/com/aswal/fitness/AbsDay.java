package com.aswal.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AbsDay extends AppCompatActivity {

    TextView legraisestitle, intropage, subintropage,
            btnexercise, vsitcrunchestitle, vsitcrunchesdes, bicycleCrunchtitle, bicycleCrunchdes,
            planktitle, plankdes, mountainClimbertitle, mountainClimberdes, legraisesdes, abstitle;

    View divpage,bgprogress;

    Animation bttone,bttwo,bttfour,bttfive,bttsix,bttseven,btteight;

    LinearLayout absrow1, absrow2, absrow3, absrow4, absrow5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_day);

        // load animations
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);



        abstitle = (TextView) findViewById(R.id.abstitle);

        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);




        // item fit layout
        absrow1 = (LinearLayout) findViewById(R.id.absrow1);
        absrow2 = (LinearLayout) findViewById(R.id.absrow2);
        absrow3 = (LinearLayout) findViewById(R.id.absrow3);
        absrow4 = (LinearLayout)findViewById(R.id.absrow4);
        absrow5 = (LinearLayout)findViewById(R.id.absrow5);




        // item fit
        legraisestitle = (TextView) findViewById(R.id.legraisestitle);
        legraisesdes = (TextView) findViewById(R.id.legraisesdes);

        vsitcrunchestitle = (TextView) findViewById(R.id.vsitcrunchestitle);
        vsitcrunchesdes= (TextView) findViewById(R.id.vsitcrunchesdes);

        bicycleCrunchtitle = (TextView) findViewById(R.id.bicycleCrunchtitle);
        bicycleCrunchdes = (TextView) findViewById(R.id.bicycleCrunchdes);

        planktitle = (TextView) findViewById(R.id.planktitle);
        plankdes = (TextView) findViewById(R.id.plankdes);

        mountainClimbertitle = (TextView) findViewById(R.id.mountainClimbertitle);
        mountainClimberdes = (TextView) findViewById(R.id.mountainClimberdes);



        // assign the animations

        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        absrow1.startAnimation(bttwo);
        absrow2.startAnimation(bttfour);
        absrow3.startAnimation(bttfive);
        absrow4.startAnimation(bttsix);
        absrow5.startAnimation(bttsix);

        btnexercise.startAnimation(bttseven);
        bgprogress.startAnimation(bttseven);

        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent a = new Intent(AbsDay.this,LegRaise.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);


            }
        });

    }
}
