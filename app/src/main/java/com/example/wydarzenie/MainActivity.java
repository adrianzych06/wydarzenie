package com.example.wydarzenie;

import android.os.Bundle;
import android.text.InputType;
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
    private TextView komunikat;
    private String email5 ="";

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
        komunikat = findViewById(R.id.textView7);

        haslo.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        powtorz.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

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
                String email = mail.getText().toString().trim();
                String pass = haslo.getText().toString().trim();
                String pass2 = powtorz.getText().toString().trim();

                if(!email.contains("@")){
                    komunikat.setText("Nieprawidłowy adres e-mail!");
                } else if (!pass.equals(pass2)){
                    komunikat.setText("Hasła się nie zgadzają!");
                } else {
                    komunikat.setText("Zarejestrowano: "+ email);
                    email5 = email;
                }
            }
        });
        zobacz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!email5.isEmpty()){
                    komunikat.setText("zalogowany uczestnik: "+email5);
                } else {
                    komunikat.setText("Nie ma uczestnika! ");
                }
            }
        });
        }
    }
