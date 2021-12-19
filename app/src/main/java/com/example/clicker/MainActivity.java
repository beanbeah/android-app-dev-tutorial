package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int count = 0;
    int press = 0;

    private void checkCount() {
        if (count == 100){
            Intent i = new Intent(MainActivity.this, WinActivity.class);
            i.putExtra("press",press);
            startActivity(i);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText(String.valueOf(count));
    }

    public void buttonClear_click(View view) {
        count = 0;
        press++;
        text.setText(String.valueOf(count));
        Toast.makeText(this, "Count reset", Toast.LENGTH_LONG).show();
    }
    public void buttonMinus_click(View view) {
        count -= 1;
        press++;
        text.setText(String.valueOf(count));
        checkCount();
    }

    public void buttonAdd_click(View view) {
        count += 1;
        press++;
        text.setText(String.valueOf(count));
        checkCount();
    }

    public void buttonDivide_click(View view) {
        count /= 2;
        press++;
        text.setText(String.valueOf(count));
        checkCount();
    }

    public void buttonMult_click(View view) {
        count *= 2;
        press++;
        text.setText(String.valueOf(count));
        checkCount();
    }

    public void buttonPow_click(View view) {
        count = count * count;
        press++;
        text.setText(String.valueOf(count));
        checkCount();
    }


}