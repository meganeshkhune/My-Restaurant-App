package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.myapplication.activities.RegistrationActivity;
import com.example.myapplication.activities.loginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        }
        public void register(View view){
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }

    public void login(View view) {
            startActivity(new Intent(MainActivity.this,RegistrationActivity.class));
    }

    public void signin(View view) {
        startActivity(new Intent(MainActivity.this, loginActivity.class));
    }
}