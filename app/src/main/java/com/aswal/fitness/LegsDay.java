package com.aswal.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LegsDay extends AppCompatActivity {

    TextView legstitle, intropage, subintropage,
            btnexercise, squatstitle, squatsdes, lungestitle, lungesdes,
            calftitle, calfdes, pistoltitle, pistoldes, glutestitle, glutesdes;

    View divpage,bgprogress;

    Animation bttone,bttwo,bttfour,bttfive,bttsix,bttseven,btteight;

    LinearLayout legrow1, legrow2, legrow3, legrow4, legrow5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legsday);

        // load animations
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);



        legstitle = (TextView) findViewById(R.id.legstitle);

        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);




        // item fit layout
        legrow1 = (LinearLayout) findViewById(R.id.legrow1);
        legrow2 = (LinearLayout) findViewById(R.id.legrow2);
        legrow3 = (LinearLayout) findViewById(R.id.legrow3);
        legrow4 = (LinearLayout)findViewById(R.id.legrow4);
        legrow5 = (LinearLayout)findViewById(R.id.legrow5);




        // item fit
        squatstitle = (TextView) findViewById(R.id.squatstitle);
        squatsdes = (TextView) findViewById(R.id.squatsdes);

        lungestitle = (TextView) findViewById(R.id.lungestitle);
         lungesdes= (TextView) findViewById(R.id.lungesdes);

        calftitle = (TextView) findViewById(R.id.calftitle);
        calfdes = (TextView) findViewById(R.id.calfdes);

        pistoltitle = (TextView) findViewById(R.id.pistoltitle);
        pistoldes = (TextView) findViewById(R.id.pistoldes);

        glutestitle = (TextView) findViewById(R.id.glutestitle);
        glutesdes = (TextView) findViewById(R.id.glutesdes);



        // assign the animations

        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        legrow1.startAnimation(bttwo);
        legrow2.startAnimation(bttfour);
        legrow3.startAnimation(bttfive);
        legrow4.startAnimation(bttsix);
        legrow5.startAnimation(bttsix);

        btnexercise.startAnimation(bttseven);
        bgprogress.startAnimation(bttseven);

        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent a = new Intent(LegsDay.this,Squats.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);


            }
        });

    }
}
