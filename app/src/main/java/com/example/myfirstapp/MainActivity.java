package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void handleText(View v){
        EditText text =  findViewById(R.id.source);
        TextView output =  findViewById(R.id.output);
        String input =  text.getText().toString();
        text.setText("");
        if(input.length()>0){
            output.setText(input);
        }
        else{
            Toast.makeText(this,"please enter text",Toast.LENGTH_SHORT).show();
        }
        Log.d("info",input);
    }
}