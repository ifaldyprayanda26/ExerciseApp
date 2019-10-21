package com.apps.ifaldyprayanda.exerciseapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {


    private int timeLoad = 5000; // untuk mengatur waktu saat splashscreen
    TextView teks_splash;
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        teks_splash = findViewById(R.id.teks1);
        loading = findViewById(R.id.loading);
        Typeface customfont = Typeface.createFromAsset(getAssets(), "fonts/Optician-Sans.otf"); // perintah untuk mengubah font pada splash screen
        teks_splash.setTypeface(customfont);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {     // perintah untuk menjalankan splash screen
                //setelah loading maka akan langsung berpindah ke StartActivity
                loading.setVisibility(View.VISIBLE); // untuk menampilkan loading di halaman view
                Intent splash = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(splash);
                finish();

            }
        },timeLoad);
    }
}
