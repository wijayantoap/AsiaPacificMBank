package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_verification);

        Button loginB = (Button) findViewById(R.id.VerifyButton);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_verification.this, login_verification2.class);
                startActivity(intent);
            }
        } );

        Button notMeB = (Button) findViewById(R.id.NotMeButton);
        notMeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_verification.this, login_layout.class);
                startActivity(intent);
            }
        } );
    }


}
