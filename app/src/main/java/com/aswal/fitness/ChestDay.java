package com.aswal.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChestDay extends AppCompatActivity {

    TextView widetitle, intropage, subintropage,
            btnexercise, diamondtitle, diamonddes, declinetitle, declinedes,
            tensiontitle, tensiondes , widedes, chesttitle;

    View divpage,bgprogress;

    Animation bttone,bttwo,bttfour,bttfive,bttsix,bttseven,btteight;

    LinearLayout chestrow1, chestrow2, chestrow3, chestrow4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_day);

        // load animations
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);



        chesttitle = (TextView) findViewById(R.id.chesttitle);

        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);




        // item fit layout
        chestrow1 = (LinearLayout) findViewById(R.id.chestrow1);
        chestrow2 = (LinearLayout) findViewById(R.id.chestrow2);
        chestrow3 = (LinearLayout) findViewById(R.id.chestrow3);
        chestrow4 = (LinearLayout)findViewById(R.id.chestrow4);





        // item fit
        widetitle = (TextView) findViewById(R.id.widetitle);
        widedes = (TextView) findViewById(R.id.widedes);

        diamondtitle = (TextView) findViewById(R.id.diamondtitle);
        diamonddes= (TextView) findViewById(R.id.diamonddes);

        declinetitle = (TextView) findViewById(R.id.declinetitle);
        declinedes = (TextView) findViewById(R.id.declinedes);

        tensiontitle = (TextView) findViewById(R.id.tensiontitle);
        tensiondes = (TextView) findViewById(R.id.tensiondes);





        // assign the animations

        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        chestrow1.startAnimation(bttwo);
        chestrow2.startAnimation(bttfour);
        chestrow3.startAnimation(bttfive);
        chestrow4.startAnimation(bttsix);


        btnexercise.startAnimation(bttseven);
        bgprogress.startAnimation(bttseven);

        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent a = new Intent(ChestDay.this, Wide.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);


            }
        });

    }
}
