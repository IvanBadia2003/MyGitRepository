package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {
    Button restMas;
    Button findall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        restMas = (Button) findViewById(R.id.restMas);

        restMas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        lst_restaurantes.class
                );
                startActivity(screenChanger);
            }
        });

        findall = (Button) findViewById(R.id.findall);

        findall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        lst_restaurantes.class
                );
                startActivity(screenChanger);
            }
        });

    }
}
