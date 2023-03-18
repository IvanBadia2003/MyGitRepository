package com.example.glovoandroid.view;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glovoandroid.entities.Index;

import java.util.ArrayList;

public class LstRestauranteActivity extends AppCompatActivity implements LstRestauranteContract.View {

    @Override
    public void successLstRestaurantes(ArrayList<Index> lstIndex) {

    }

    @Override
    public void failureLstRestaurantes(String err) {

    }
}