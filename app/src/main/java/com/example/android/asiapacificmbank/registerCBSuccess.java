package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerCBSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_cbsuccess);

        Button homeB = (Button) findViewById(R.id.homeButton);
        homeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registerCBSuccess.this, MainActivity.class);
                startActivity(intent);


                    }
                });
        Button currentB = (Button) findViewById(R.id.LoginButton);
        currentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registerCBSuccess.this, accounts.class);
                startActivity(intent);
            }
        });
        }
    }