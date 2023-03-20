package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glovoandroid.entities.Index;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.presenter.LstRestaurantePresenter;
import com.example.glovoandroid.view.LstRestauranteContract;

import java.util.ArrayList;

public class FichaDescriptiva extends AppCompatActivity implements LstRestauranteContract.View {

    private LstRestaurantePresenter lstPeliculasPresenter;
    private TextView nombre;
    private TextView descripcion;
    private TextView puntuacion;
    private TextView ventas;

    private Integer id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_descriptiva);

        initComponents();
        initPresenter();
        initData();


    }


    private void initComponents(){

        nombre = findViewById(R.id.idNombre);
        descripcion = findViewById(R.id.idDescripcion);
        puntuacion = findViewById(R.id.idPuntuacion);
        ventas = findViewById(R.id.idVentas);


    }

    public  void initPresenter(){
        lstPeliculasPresenter = new LstRestaurantePresenter(this);
    }

    public void initData(){
        lstPeliculasPresenter.lstRestaurantes(null);
    }

    @Override
    public void successLstRestaurantes(ArrayList<Index> lstIndex) {
        for (Restaurante restaurante: lstIndex.get(0).getFichatecnica()){
            Bundle miBundle = this.getIntent().getExtras();
            if(miBundle!=null){
                id = miBundle.getInt("id_restaurante");
                if (id.equals(restaurante.getId_restaurante())){
                    nombre.setText(restaurante.getNombre());
                    descripcion.setText(restaurante.getNombre());
                    puntuacion.setText(restaurante.getPuntiacion());
                    ventas.setText(restaurante.getVentas());

                }
            }
        }
    }

    @Override
    public void failureLstRestaurantes(String err) {
        Toast.makeText(this,err, Toast.LENGTH_LONG).show();
    }

}