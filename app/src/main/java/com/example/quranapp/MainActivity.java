package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ayat;
    Button find;
    EditText surah_num,ayat_num;
    Quran_data data =new Quran_data();
    Quran_info info = new Quran_info();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ayat = findViewById(R.id.ayat_display);
        find = findViewById(R.id.find);
        surah_num= findViewById(R.id.Surah_num);
        ayat_num= findViewById(R.id.Ayat_Num);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Integer.valueOf(surah_num.getText().toString())<114) {
                    if (surah_num.getText().toString().equals("") && !ayat_num.getText().toString().isEmpty()) {
                        ayat.setText((data.QuranArabicText)[Integer.valueOf(ayat_num.getText().toString())]);
                    } else if (!surah_num.getText().toString().equals("") && ayat_num.getText().toString().equals("")) {
                        ayat.setText((data.QuranArabicText)[info.SSP[Integer.valueOf(surah_num.getText().toString()) - 1]]);
                    } else if (!surah_num.getText().toString().equals("") && !ayat_num.getText().toString().equals("")) {
                        ayat.setText((data.QuranArabicText)[info.SSP[Integer.valueOf(surah_num.getText().toString()) - 1] + Integer.valueOf(ayat_num.getText().toString()) - 1]);
                    } else {
                        ayat.setText("not found");
                    }
                }
                else {
                    ayat.setText("not found");
                }

            }
        });

        ayat.setText((data.QuranArabicText)[0]);

    }
}