package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
    }
    public void login_button(View v)
    {
        String userval = user.getText().toString();
        String passval = pass.getText().toString();
        if( (userval.equals("chan")) && (passval.equals("chan1234")))
        {
            Intent i1 = new Intent(getBaseContext(),movie.class);
            i1.putExtra("Value",userval);
            startActivity(i1);
            finish();

        }
        else
        {
            Toast toast = Toast.makeText(this, "Invalid Credintials", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}