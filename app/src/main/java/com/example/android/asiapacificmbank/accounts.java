package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnTouchListener;

import com.imangazaliev.circlemenu.CircleMenu;
import com.imangazaliev.circlemenu.CircleMenuButton;

import static com.example.android.asiapacificmbank.R.id.header;

public class accounts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);

        Button currentB = (Button) findViewById(R.id.buttonCAccount);
        currentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(accounts.this, current_account.class);
                startActivity(intent);

                final TextView txtview = (TextView) findViewById(header);
                txtview.setOnTouchListener(new OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            if (event.getRawX() >= txtview.getRight() - txtview.getTotalPaddingRight()) {
                                Intent intent = new Intent(accounts.this, MainActivity.class);
                                startActivity(intent);

                                return true;
                            }
                            else if (event.getRawX() >= txtview.getLeft() - txtview.getTotalPaddingLeft()) {
                                Intent intent = new Intent(accounts.this, profile_layout.class);
                                startActivity(intent);

                                return true;
                            }
                        }
                        return true;
                    }
                });
            }
});
    }}


