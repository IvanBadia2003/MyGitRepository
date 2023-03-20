package com.example.glovoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.entities.Index;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.presenter.LstRestaurantePresenter;
import com.example.glovoandroid.view.LstRestauranteAdapter;
import com.example.glovoandroid.view.LstRestauranteContract;

import java.util.ArrayList;

public class lst_restaurantes extends AppCompatActivity implements LstRestauranteContract.View{

    String texto;
    ImageView flecha;
    String Hamburgueseria = "Hamburgueseria";
    String Pizzeria = "Pizzeria";
    String PolloFrito = "Pollo frito";
    String Sandwicheria = "Sandwicheria";
    String MasVentas = "Ventas";
    String MasPuntuacion = "Puntuacion";
    ArrayList<Restaurante> lstRestaurantes;
    LstRestaurantePresenter lstRestaurantePresenter;
    ImageView imgRestaurante;
    RecyclerView recyclerRestaurante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lst_restaurantes);





        initComponentes();
        initPresenter();
        initData();


    }
    private void initComponentes() {
        lstRestaurantes = new ArrayList<>();
        imgRestaurante = findViewById(R.id.idImgRestaurante);

    }


    public  void initPresenter(){

        lstRestaurantePresenter = new LstRestaurantePresenter(this);
    }

    public void initData(){

        lstRestaurantePresenter.lstRestaurantes(null);
    }


    @Override
    public void successLstRestaurantes(ArrayList<Index> lstIndex) {
        Bundle miBundle = this.getIntent().getExtras();
        if(miBundle!=null){
            texto = miBundle.getString("Filtro");
            if(texto.equals(Hamburgueseria)){
                lstRestaurantes = lstIndex.get(0).getRestauranteHamburguseria();
                Toast.makeText(this, "Restaurante de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(Pizzeria)){
                lstRestaurantes = lstIndex.get(0).getRestaurantePizzeria();
                Toast.makeText(this,"Restaurante de "+texto, Toast.LENGTH_SHORT).show();
            }if(texto.equals(PolloFrito)){
                lstRestaurantes = lstIndex.get(0).getRestaurantePolloFrito();
                Toast.makeText(this,"Restaurante de "+texto, Toast.LENGTH_SHORT).show();
            }if(texto.equals(Sandwicheria)){
                lstRestaurantes = lstIndex.get(0).getRestauranteSandwicheria();
                Toast.makeText(this,"Restaurante de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(MasVentas)){
                lstRestaurantes = lstIndex.get(0).getRestauranteMasVentas();
                Toast.makeText(this, "Restaurantes con mas "+texto, Toast.LENGTH_SHORT).show();
            }if(texto.equals(MasPuntuacion)){
                lstRestaurantes = lstIndex.get(0).getRestauranteMasPuntuacion();
                Toast.makeText(this, "Restaurantes con mas "+texto, Toast.LENGTH_SHORT).show();
            }

        } else {
            lstRestaurantes = lstIndex.get(0).getRestaurante();
        }

        recyclerRestaurante = (RecyclerView) findViewById(R.id.listaRestaurantes);
        recyclerRestaurante.setLayoutManager(new LinearLayoutManager(this));

        LstRestauranteAdapter adapter = new LstRestauranteAdapter(lstRestaurantes,this);
        recyclerRestaurante.setAdapter(adapter);





    }

    @Override
    public void failureLstRestaurantes(String err) {

        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }





}
