package com.example.skill42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1= (CheckBox) findViewById(R.id.idChec1);
        c2= (CheckBox) findViewById(R.id.idChec2);
    }

    public void onclick(View view) {
        if (view.getId()==R.id.btn1){
            validar();
        }

    }

    private void validar(){
        String cad="Seleccionado: \n";

        if (c1.isChecked()==true){
            cad+="Opcion1\n";
        }

        if (c2.isChecked()){
            cad+="Opcion2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();

    }


}
