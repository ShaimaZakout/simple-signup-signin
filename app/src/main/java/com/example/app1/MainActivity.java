package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
            LinearLayout splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash=findViewById(R.id.Splash_LL);
        splash.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(MainActivity.this,LoginActivity.class);
       startActivity(i);

    }
}
