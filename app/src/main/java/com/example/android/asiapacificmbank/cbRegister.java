package com.example.android.asiapacificmbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class cbRegister extends AppCompatActivity {

    private Spinner idSpinner;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_register);

        addItemsOnSpinner();

        Button registerB = (Button) findViewById(R.id.RegisterButton);
        registerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister.this, cbRegister2.class);
                startActivity(intent);
            }
        });

        Button homeB = (Button) findViewById(R.id.homeButton);
        homeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cbRegister.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    //add items into spinner dynamically

    public void addItemsOnSpinner(){
        idSpinner = (Spinner) findViewById(R.id.spinnerID);
        List <String> list = new ArrayList<>();
        list.add("IC");
        list.add("Army ID");
        list.add("Passport");
        list.add("Others");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        idSpinner.setAdapter(dataAdapter);
    }
}
