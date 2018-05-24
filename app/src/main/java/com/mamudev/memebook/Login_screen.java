package com.mamudev.memebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_screen extends AppCompatActivity {

    EditText userEmail, userPassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTheme(R.style.LoginTheme);
        setContentView(R.layout.activity_login_screen);
        //ActionBar actionBar=getSupportActionBar();
        //actionBar.hide();

        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Login_screen.this, "Email-Id = " + userEmail + "\n" +
                        "Password = " + userPassword, Toast.LENGTH_LONG).show();

                Intent toMain = new Intent(Login_screen.this, MainActivity.class);
                startActivity(toMain);

            }
        });

    }

    public void goToForgotPassword(View view) {

        Intent toForgotPassword = new Intent(this, Forgotpassword_screen.class);
        startActivity(toForgotPassword);

    }

    public void toFacebookLogin(View view) {

        Toast.makeText(this, "Facebook Login Process is Inititated", Toast.LENGTH_LONG).show();

    }

    public void toSignup(View view) {

        Intent toSignup = new Intent(this, SignUpActivity.class);
        startActivity(toSignup);

    }

}
