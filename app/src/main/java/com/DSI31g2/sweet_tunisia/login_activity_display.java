package com.DSI31g2.sweet_tunisia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login_activity_display extends AppCompatActivity {

    final String EXTRA_LOGIN = "email";
    final String EXTRA_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentification);

        Intent intent = getIntent();
        TextView loginDisplay = findViewById(R.id.email);
        TextView passwordDisplay = findViewById(R.id.password);

        if (intent != null) {
            loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
            passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }
    }
}
