package com.example.skill410;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayList<String> comboDiasList = new ArrayList<String>();

        comboDiasList.add("Seleccione");
        for (int i = 0; i <= 10; i++) {
            comboDiasList.add("Opcion: " + i);
        }
//        comboDiasList.add("Seleccion");
//        comboDiasList.add("Lunes");
//        comboDiasList.add("Martes");
//        comboDiasList.add("Miercoles");
//        comboDiasList.add("Jueves");
//        comboDiasList.add("Viernes");
//        comboDiasList.add("Sabado");
//        comboDiasList.add("Domingo");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,comboDiasList);

        comboDias.setAdapter(adapter);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Seleccionado: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();

                estado.setText("Seleccion: " + adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
