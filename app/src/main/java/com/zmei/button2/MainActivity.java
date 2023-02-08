package com.zmei.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int calk = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View view) {
        calk = calk + 1;
        TextView click = findViewById(R.id.textView);
        click.setText(""+calk);
        click.setTextColor(Color.RED);
        click.setTextSize(44);

    }
}