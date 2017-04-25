package com.raksa.startedservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonStart(View view) {
        Intent startIntent = new Intent( MainActivity.this , MyStartedService.class);
        startService(startIntent);
    }

    public void onButtonStop(View view) {
        Intent stopIntent = new Intent( MainActivity.this, MyStartedService.class);
        stopService(stopIntent);
    }
}
