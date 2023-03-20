package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FiltrosRestauranteActivity extends AppCompatActivity {


    EditText filtro;
    Button buscar;
    Button restaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtros_restaurantes);


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

        restaurante = (Button) findViewById(R.id.idMostrarRestaurante);
        restaurante.setOnClickListener(new View.OnClickListener() {
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
