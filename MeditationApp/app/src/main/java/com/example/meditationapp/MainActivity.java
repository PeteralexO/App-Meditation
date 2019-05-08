package com.example.meditationapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void play (View v) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.naturea);
        mediaPlayer.start();
        if (mediaPlayer2!=null){
            mediaPlayer2.pause();
        }
        if (mediaPlayer3!=null){
            mediaPlayer3.pause();
        }

    }
    public void paus (View v) {
        if (mediaPlayer!=null){
            mediaPlayer.pause();
        }
        if (mediaPlayer2!=null){
            mediaPlayer2.pause();
        }
        if (mediaPlayer3!=null){
            mediaPlayer3.pause();
        }
    }
    public void play2 (View v) {

        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), R.raw.waterfall);
        mediaPlayer2.start();
        if (mediaPlayer3!=null){
            mediaPlayer3.pause();
        }
        if (mediaPlayer!=null){
            mediaPlayer.pause();
        }

    }
    public void play3 (View v) {

        mediaPlayer3 = MediaPlayer.create(getApplicationContext(), R.raw.ocean);

        mediaPlayer3.start();
        if (mediaPlayer!=null){
            mediaPlayer.pause();
        }
        if (mediaPlayer2!=null) {
            mediaPlayer2.pause();

        }
    }


}

