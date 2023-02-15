package com.example.skill54.adapter;

import com.example.skill54.model.Movie;
import com.example.skill54.movie_list.MovieListActivity;

import java.util.List;
import java.util.Locale;
import java.util.logging.Filter;

public class MoviesAdapter {
    public MoviesAdapter(MovieListActivity movieListActivity, List<Movie> moviesList) {

    }

    public void notifyDataSetChanged() {
    }


    public Object getFilter(Filter filter) {
        return filter;
    }

    public void setFilterParameter(String fromReleaseFilter, String toReleaseFilter) {

    }
}
