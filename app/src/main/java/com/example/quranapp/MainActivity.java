package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ayat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Quran_data data =new Quran_data();
        int a,b;
        a=3;
        b=10;
        ayat = findViewById(R.id.ayat_display);
        ayat.setText((data.GetData(a,b))[0]);

    }
}