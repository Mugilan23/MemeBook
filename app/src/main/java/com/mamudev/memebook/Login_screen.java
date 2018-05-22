package com.mamudev.memebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login_screen extends AppCompatActivity {
    TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        forgotPassword=findViewById(R.id.tvForgotpassword);

    }

    public void gotoForgotPassword(View view) {
        startActivity(new Intent(this,Forgotpassword_screen.class));
    }
}
