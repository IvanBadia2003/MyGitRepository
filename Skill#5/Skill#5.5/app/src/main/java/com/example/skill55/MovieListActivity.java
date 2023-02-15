package com.example.skill55;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.skill55.adapters.MovieRecyclerView;
import com.example.skill55.viewmodels.ModelListViewModel;

public class MovieListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieRecyclerView movieRecyclerAdapter;
    private ModelListViewModel modelListViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void ConfigureRecyclerView(){
        movieRecyclerAdapter = new MovieRecyclerView(modelListViewModel.getMovies(),this);
    }
}