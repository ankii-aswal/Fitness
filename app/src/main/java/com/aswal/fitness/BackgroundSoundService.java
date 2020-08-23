package com.aswal.fitness;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.IOException;


public class BackgroundSoundService extends Service {
    public int play = 0;

    private static final String TAG = null;
    MediaPlayer player;
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        player = MediaPlayer.create(this, R.raw.heathens);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);


        new java.util.Timer().schedule(
                new java.util.TimerTask(){
                    @Override
                    public void run(){
                        player.pause();
                    }
                },10000);



    }



    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return 1;
    }

    public void onStart(Intent intent, int startId) {
        // TO DO
    }
    public IBinder onUnBind(Intent intent) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }


    public void onPause() {


    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();

    }

    @Override
    public void onLowMemory() {

    }
}

