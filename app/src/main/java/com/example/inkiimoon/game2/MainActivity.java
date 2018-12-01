package com.example.inkiimoon.game2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonHome = (Button) findViewById(R.id.mainButton);
        final TextView numberView = (TextView) findViewById(R.id.numberView);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = numberView.getText().toString();
                Log.i("info", number);
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("Value", number);
                startActivity(intent);
            }
        });

    }
}
