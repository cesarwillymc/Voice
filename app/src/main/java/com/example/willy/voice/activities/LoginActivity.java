package com.example.willy.voice.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.willy.voice.R;

public class LoginActivity extends AppCompatActivity {
    CardView CV_login;
    EditText ET_user;
    EditText ET_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        CV_login = (CardView) findViewById(R.id.CV_login);
        ET_user = (EditText) findViewById(R.id.ET_user);
        ET_password = (EditText) findViewById(R.id.ET_password);
        CV_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
