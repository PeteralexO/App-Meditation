package com.example.meditationapp;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Song
    extends MainActivity{
        MediaPlayer mediaPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.naturea);

            mediaPlayer.start();

        }

        @Override
        protected void onPause() {
            super.onPause();
            mediaPlayer.stop();
            mediaPlayer.release();

        }
}
