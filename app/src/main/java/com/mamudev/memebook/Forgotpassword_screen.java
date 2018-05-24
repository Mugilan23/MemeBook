package com.mamudev.memebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forgotpassword_screen extends AppCompatActivity {

    EditText resetEmailPassword;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTheme(R.style.LoginTheme);
        setContentView(R.layout.activity_forgotpassword_screen);
        //ActionBar actionBar=getSupportActionBar();
        //actionBar.hide();

        resetEmailPassword = findViewById(R.id.resetEmailPassword);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Forgotpassword_screen.this, "The Email " + resetEmailPassword +
                        " is sent", Toast.LENGTH_LONG).show();

                backToLogin(v);

            }
        });

    }

    public void backToLogin(View view) {

        Intent backToLogin = new Intent(this, Login_screen.class);
        startActivity(backToLogin);

    }

}
