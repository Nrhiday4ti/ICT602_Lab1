package com.example.lab1_hidayati;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText2);
    }


    public void displayText(View view){

        String text = etName.getText().toString();

        tvMessage.setText("Welcome! " + text);

        Toast toast = Toast.makeText(this, "WELCOME", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText(View view){
        etName.getText().clear();
        Toast.makeText(this, "NAME CLEARED", Toast.LENGTH_SHORT).show();
        tvMessage.setText("Hello There!");
    }
}