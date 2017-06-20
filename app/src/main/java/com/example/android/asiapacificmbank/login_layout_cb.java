package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_layout_cb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout_cb);

        Button registerb = (Button) findViewById(R.id.RegisterButton);
        registerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_layout_cb.this, cbRegister.class);
                startActivity(intent);
            }
        });

        Button homeb = (Button) findViewById(R.id.homeButton);
        homeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_layout_cb.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button login2B = (Button) findViewById(R.id.LoginButton);
        login2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_layout_cb.this, registerCBSuccess.class);
                startActivity(intent);
            }
        });
    }
}
