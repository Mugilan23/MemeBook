package com.mamudev.memebook;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashPage extends AppCompatActivity {

    private static int TIME_OUT = 3000; //Time to Launch Another Activity.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTheme(R.style.SplashTheme);
        setContentView(R.layout.activity_splash_page);

        //Splash Screen to Next Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashPage.this, MainActivity.class);
                startActivity(i);

                finish();

            }
        }, TIME_OUT);

    }
}
