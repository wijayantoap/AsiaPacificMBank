package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class login_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);

        Button loginB = (Button) findViewById(R.id.buttonLogin);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_layout.this, login_verification.class);
                startActivity(intent);
            }
    } );

        Button cancelB = (Button) findViewById(R.id.buttonCancel);
        cancelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_layout.this, MainActivity.class);
                startActivity(intent);
            }
        } );
    }
}
