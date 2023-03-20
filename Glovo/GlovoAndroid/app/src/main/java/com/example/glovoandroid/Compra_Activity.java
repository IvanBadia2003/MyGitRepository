package com.example.glovoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.glovoandroid.entities.Index;
import com.example.glovoandroid.view.LstRestauranteContract;

import java.util.ArrayList;

public class Compra_Activity extends AppCompatActivity implements LstRestauranteContract.View {


    Button confirmar;
    Spinner spinnerCines;
    Spinner spinnerHora;
    Spinner spinnerButacas;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra);

        confirmar = (Button)findViewById(R.id.confirmar);
        spinnerCines = (Spinner)findViewById(R.id.spinnerCine);
        spinnerHora = (Spinner)findViewById(R.id.spinnerHora);
        spinnerButacas = (Spinner)findViewById(R.id.spinnerButaca);



        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        CompraConfirmada.class
                );
                startActivity(screenChanger);
            }
        });



        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.restaurante, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter2 =ArrayAdapter.createFromResource(this,R.array.Bebida, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence>adapter3 =ArrayAdapter.createFromResource(this,R.array.Comida, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);


        spinnerCines.setAdapter(adapter);
        spinnerHora.setAdapter(adapter2);
        spinnerButacas.setAdapter(adapter3);


    }


    @Override
    public void successLstRestaurantes(ArrayList<Index> lstIndex) {

    }

    @Override
    public void failureLstRestaurantes(String err) {

    }
}