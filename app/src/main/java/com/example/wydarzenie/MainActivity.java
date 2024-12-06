package com.example.wydarzenie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button polub, usun,zapisz,zobacz;
    private TextView licznik;
    private int polubienia = 0;
    private EditText mail;
    private EditText haslo;
    private EditText powtorz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polub = findViewById(R.id.polub);
        usun = findViewById(R.id.usun);
        zapisz = findViewById(R.id.zapisz);
        zobacz = findViewById(R.id.zobacz);
        licznik = findViewById(R.id.textView);
        mail = findViewById(R.id.mail);
        haslo = findViewById(R.id.haslo);
        powtorz = findViewById(R.id.powtorz);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                polubienia++;
                licznik.setText(polubienia + "polubień");
            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(polubienia>0) {
                    polubienia--;
                    licznik.setText(polubienia + "polubień");
                }
            }
        });
        zapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        }
    }
