package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnTouchListener;
import com.imangazaliev.circlemenu.CircleMenu;
import com.imangazaliev.circlemenu.CircleMenuButton;

import static com.example.android.asiapacificmbank.R.id.header;

public class profile_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_layout);

        ImageButton accountB = (ImageButton) findViewById(R.id.accountButton);
        accountB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile_layout.this, accounts.class);
                startActivity(intent);
            }
        });

        ImageButton transferB = (ImageButton) findViewById(R.id.transferButton);
        transferB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile_layout.this, transfer_page.class);
                startActivity(intent);
            }
        });

        ImageButton currentB = (ImageButton) findViewById(R.id.historyButton);
        currentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile_layout.this, current_account.class);
                startActivity(intent);
            }
        });

        ImageButton messageB = (ImageButton) findViewById(R.id.messageButton);
        messageB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile_layout.this, message_activity.class);
                startActivity(intent);
            }
        });

        final TextView txtview = (TextView) findViewById(header);
        txtview.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= txtview.getRight() - txtview.getTotalPaddingRight()) {
                        Intent intent = new Intent(profile_layout.this, MainActivity.class);
                        startActivity(intent);

                        return true;
                    }
                }
                return true;
            }
        });


    }


}