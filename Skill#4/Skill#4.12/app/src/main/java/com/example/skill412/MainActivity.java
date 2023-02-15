package com.example.skill412;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDias;
    TextView txtId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDias = (ListView) findViewById(R.id.listViewId);
        txtId = (TextView) findViewById(R.id.txtId);

        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Carlos");
        listaNombres.add("Juan");

        for (int i = 0; i < 3; i++) {
            listaNombres.add("Nombre " + i);
        }

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNombres);

        listaDias.setAdapter(adapter);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Selecciona: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

                txtId.setText("Nombre seleccionado: " + adapterView.getItemAtPosition(i).toString());
            }
        });

    }
}