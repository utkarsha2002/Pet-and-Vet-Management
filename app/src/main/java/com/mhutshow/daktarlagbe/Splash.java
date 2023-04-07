package com.mhutshow.daktarlagbe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.mhutshow.daktarlagbe.controller.MainActivity;

public class Splash extends AppCompatActivity {
    public static int SPLASH_TIMER = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Onboard.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMER);

    }
}