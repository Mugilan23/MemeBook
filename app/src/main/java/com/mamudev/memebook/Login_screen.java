package com.mamudev.memebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_screen extends AppCompatActivity {
    TextView forgotPassword;
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        forgotPassword=findViewById(R.id.tvForgotpassword);
        btlogin=findViewById(R.id.btLogin);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_screen.this,MainActivity.class));

            }
        });

    }

    public void gotoForgotPassword(View view) {
        startActivity(new Intent(this,Forgotpassword_screen.class));
    }
}
