package com.example.fintech1lab2021;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    TextView tvMain;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void OnBtnclick(View view) {
        this.tvMain.setText(R.string.changed_label_capt); }

    public void OnBtnclickcolor(View view) {
        TextView textElement = (TextView) findViewById(R.id.tvMain);
        textElement.setTextColor(0xFF00FF00); //this is green color
    }
}