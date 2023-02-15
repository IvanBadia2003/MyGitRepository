package com.example.skill53.Interface;

import com.example.skill53.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholder {

    @GET("posts")
    Call<List<Posts>>getPosts();

}
