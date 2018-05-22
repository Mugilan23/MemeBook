package com.mamudev.memebook;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashPage extends AppCompatActivity {
    LinearLayout l1;
    Animation animation;


    private static int TIME_OUT = 3000; //Time to Launch Another Activity.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        super.setTheme(R.style.SplashTheme);
        setContentView(R.layout.activity_splash_page);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        l1=findViewById(R.id.LinearLayout);
        animation=AnimationUtils.loadAnimation(this,R.anim.uptodown_logo_anim);
        l1.setAnimation(animation);



        //Splash Screen to Next Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashPage.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);

                finish();

            }
        }, TIME_OUT);

    }
}
