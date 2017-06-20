package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnTouchListener;

import at.markushi.ui.CircleButton;

import static com.example.android.asiapacificmbank.R.id.header;

public class message_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_activity);


        final TextView txtview = (TextView) findViewById(header);
        txtview.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= txtview.getRight() - txtview.getTotalPaddingRight()) {
                        Intent intent = new Intent(message_activity.this, MainActivity.class);
                        startActivity(intent);

                        return true;
                    }
                    else if (event.getRawX() >= txtview.getLeft() - txtview.getTotalPaddingLeft()) {
                        Intent intent = new Intent(message_activity.this, profile_layout.class);
                        startActivity(intent);

                        return true;
                    }
                }
                return true;
            }
        });

    }
}
