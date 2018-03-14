package com.duyquang.week3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rvMovie = findViewById(R.id.recycler_view);

        Gson gson = new Gson();
        String movieData=MyApp.getMessage();
        Movie movie = (Movie) gson.fromJson(movieData, Movie.class);
        results=movie.getResults();
        Adapter adapter = new Adapter(this, results);

        rvMovie.setAdapter(adapter);
        rvMovie.setLayoutManager(new LinearLayoutManager(this));


    }
}