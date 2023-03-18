package com.example.glovoandroid.model;

import com.example.glovoandroid.entities.Index;
import com.example.glovoandroid.utils.ApiInterface;
import com.example.glovoandroid.utils.ApiRestaurante;
import com.example.glovoandroid.view.LstRestauranteContract;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstRestauranteModel implements LstRestauranteContract.Model {

    @Override
    public void lstRestaurantesWS(Index index, OnLstRestaurantesListener onLstRestaurantesListener) {
        ApiInterface apiService = ApiRestaurante.getRestaurantes().create(ApiInterface.class);

        Call<ArrayList<Index>> call = apiService.getApi();
        call.enqueue(new Callback<ArrayList<Index>>() {
            @Override
            public void onResponse(Call<ArrayList<Index>> call, Response<ArrayList<Index>> response) {
                ArrayList<Index> indexRespuesta = response.body();

                onLstRestaurantesListener.onSuccess(indexRespuesta);

            }

            @Override
            public void onFailure(Call<ArrayList<Index>> call, Throwable t) {
                onLstRestaurantesListener.onFailure(t.getMessage());
            }
        });
    }
}
