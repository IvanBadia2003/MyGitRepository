package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {
        Button findall;
    Button buscar;
    Button comprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);



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

        buscar = (Button) findViewById(R.id.buscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        FiltrosRestauranteActivity.class
                );
                startActivity(screenChanger);
            }
        });

        comprar = (Button) findViewById(R.id.comprar);

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Compra_Activity.class
                );
                startActivity(screenChanger);
            }
        });

    }
}
