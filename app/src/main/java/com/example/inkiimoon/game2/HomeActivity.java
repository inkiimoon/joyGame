package com.example.inkiimoon.game2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView showPin = (TextView)  findViewById(R.id.showPin);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        Intent intent = getIntent();
        String Pin = intent.getStringExtra("Value");
        showPin.setText(Pin);

        Intent intentToJoy = new Intent(HomeActivity.this, JoyActivity.class);
        startActivity(intentToJoy);
    }
}
