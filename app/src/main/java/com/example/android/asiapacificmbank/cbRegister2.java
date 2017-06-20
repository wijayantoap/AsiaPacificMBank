package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cbRegister2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_register2);

        Button registerB = (Button) findViewById(R.id.RegisterButton);
        registerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister2.this, cbRegister3.class);
                startActivity(intent);
            }
        });

        Button homeB = (Button) findViewById(R.id.homeButton);
        homeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void buttonClick(View v)
    {
        TextView tv = (TextView) findViewById(R.id.resendText);
        tv.setText("Verification code has been sent");
    }
}
