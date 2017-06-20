package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cbRegister3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_register3);

        Button registerB = (Button) findViewById(R.id.RegisterButton);
        registerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister3.this, registerCBSuccess.class);
                startActivity(intent);
            }
        });

        Button homeB = (Button) findViewById(R.id.homeButton);
        homeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
