package com.example.android.asiapacificmbank;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.List;

import static com.example.android.asiapacificmbank.R.id.header;

public class transfer_page extends AppCompatActivity {

    private Spinner IDSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_page);

        Button button = (Button) findViewById(R.id.confirmBtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);


                AlertDialog alertDialog = new AlertDialog.Builder(transfer_page.this).create(); //Read Update
                alertDialog.setTitle("Success");
                alertDialog.setMessage("Transfer Success!");



                alertDialog.show();  //<-- See This!
            }

        });

        final TextView txtview = (TextView) findViewById(header);
        txtview.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= txtview.getRight() - txtview.getTotalPaddingRight()) {
                        Intent intent = new Intent(transfer_page.this, MainActivity.class);
                        startActivity(intent);

                        return true;
                    }
                    else if (event.getRawX() >= txtview.getLeft() - txtview.getTotalPaddingLeft()) {
                        Intent intent = new Intent(transfer_page.this, profile_layout.class);
                        startActivity(intent);

                        return true;
                    }
                }
                return true;
            }
        });
    }

    public void addItemsOnSpinner(){
        IDSpinner = (Spinner) findViewById(R.id.fromaccount);
        List<String> list = new ArrayList<>();
        list.add("Saving Account");
        list.add("Family Account");
        list.add("Current Account");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        IDSpinner.setAdapter(dataAdapter);
    }
}
