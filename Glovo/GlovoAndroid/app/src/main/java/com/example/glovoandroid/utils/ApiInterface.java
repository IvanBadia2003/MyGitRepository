package com.example.glovoandroid.utils;

import com.example.glovoandroid.entities.Index;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api")
    Call<ArrayList<Index>> getApi();
}

