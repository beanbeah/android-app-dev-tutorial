package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {
    TextView text;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int press = extras.getInt("press");
            message = "You won! You took " + press + " number of button press to win!";
            //The key argument here must match that used in MainActivity.java
        }
        text = (TextView) findViewById(R.id.textView);
        text.setText(message);

    }
}