package com.apptechnixdogwalkingdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    AppCompatEditText emailfield;
    AppCompatEditText firstnamefield;
    AppCompatEditText lastnamefield;
    AppCompatEditText ca_password;
    AppCompatButton registernow;

    String emailregex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        emailfield = findViewById(R.id.emailfield);
        firstnamefield = findViewById(R.id.firstnamefield);
        lastnamefield = findViewById(R.id.lastnamefield);
        ca_password = findViewById(R.id.ca_password);
        registernow = findViewById(R.id.registernow);

        registernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmailValidation();
            }
        });
    }

    private boolean EmailValidation() {
        if (emailfield.getText().toString().isEmpty()) {
            emailfield.setError("Please complete email field");
            return false;
        } else {
            return true;
        }


    }

}