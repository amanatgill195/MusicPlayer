package com.example.rupneetsandhu.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;

public class MusicLibrary extends AppCompatActivity {
    private Button btAddMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VSPdpDKRMND382hqIRFIaiVLgbkhM0E1rL32l1SQ")
                .clientKey("NnOwo2ejzrpQJD98uF9weupAo2AFH305DCOLVaBQ")
                .server("https://parseapi.back4app.com/")
                .build()
        );

        btAddMusic = findViewById(R.id.btAddMusic);
        btAddMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicLibrary.this, AddMusic.class);
                startActivity(intent);
            }
        });
    }

}
