package com.example.rupneetsandhu.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MediaPlayer extends AppCompatActivity implements View.OnClickListener {
    private ImageView btBack, btNext, btPlay, btPause;
    private android.media.MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btBack = findViewById(R.id.btBack);
        btNext = findViewById(R.id.btNext);
        btPlay = findViewById(R.id.btPlay);
        btPause = findViewById(R.id.btPause);

        btPlay.setOnClickListener(this);
        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        btPause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btPlay:
                if (mediaPlayer == null) {
                    mediaPlayer = android.media.MediaPlayer.create(getApplicationContext(), R.raw.music);
                    mediaPlayer.start();
                }
                break;

            case R.id.btPause:
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                break;

            case R.id.btBack:
                break;
            case R.id.btNext:
                break;
        }
    }
}
