package com.example.oofapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    //public final MediaPlayer oof = MediaPlayer.create(this, R.raw.ooof);

    //final MediaPlayer okBoomer = MediaPlayer.create(this, R.raw.ok_boomer);



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer okBoomer = MediaPlayer.create(this, R.raw.ok_boomer);
        final MediaPlayer oof = MediaPlayer.create(this, R.raw.ooof);

        Button oofs = findViewById(R.id.OOFButton);
        Button okBoomers = findViewById(R.id.OKButton);

        oofs.setOnClickListener(v -> {
             // call oof noise function
                oof.start();
            });

        okBoomers.setOnClickListener(v -> {
            // call okboomer noise function
                okBoomer.start();
        });

    }






}
