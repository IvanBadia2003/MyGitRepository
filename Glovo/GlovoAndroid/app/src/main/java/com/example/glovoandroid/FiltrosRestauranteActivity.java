package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FiltrosRestauranteActivity extends AppCompatActivity {

    ImageView flecha;
    EditText filtro;
    Button buscar;
    Button pelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtros_restaurantes);

        flecha = (ImageView) findViewById(R.id.idFlecha);

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Inicio.class
                );
                startActivity(screenChanger);
            }
        });

        filtro = (EditText) findViewById(R.id.idFiltro);
        buscar = (Button) findViewById(R.id.idBtnBuscar);


        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent screenChanger = new Intent(getBaseContext(),
                        lst_restaurantes.class
                );
                Bundle filtroBundle = new Bundle();
                filtroBundle.putString("Filtro",filtro.getText().toString());

                screenChanger.putExtras(filtroBundle);

                startActivity(screenChanger);

            }
        });

        pelicula = (Button) findViewById(R.id.idMostrarPeli);
        pelicula.setOnClickListener(new View.OnClickListener() {
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
