package com.sapuan.moviecataloguesub1;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewMovies;
    MoviesAdapter moviesAdapter;
    String[] judulMovie, tglRilis, durasiMovie, genres, sinopsis, rate;
    TypedArray posterMovie, backPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesAdapter = new MoviesAdapter(this);

        listViewMovies = findViewById(R.id.listViewMovie);
        listViewMovies.setAdapter(moviesAdapter);

        posterMovie = getResources().obtainTypedArray(R.array.list_poster_movies);
        backPoster = getResources().obtainTypedArray(R.array.list_poster_movies);
        rate = getResources().getStringArray(R.array.list_voting_rate);
        judulMovie = getResources().getStringArray(R.array.list_judul_movies);
        tglRilis = getResources().getStringArray(R.array.list_tglRilis);
        durasiMovie = getResources().getStringArray(R.array.list_durasi_movies);
        genres = getResources().getStringArray(R.array.list_genre_movies);
        sinopsis = getResources().getStringArray(R.array.list_sinopsis_movies);

        final ArrayList<Movies> movieList = new ArrayList<>();

        for (int x = 0; x < judulMovie.length; x++) {
            Movies movies = new Movies();
            movies.setPosterMovie(posterMovie.getResourceId(x, -1));
            movies.setBackPoster(backPoster.getResourceId(x, -1));
            movies.setJudul(judulMovie[x]);
            movies.setTglRilis(tglRilis[x]);
            movies.setDurasi(durasiMovie[x]);
            movies.setGenre(genres[x]);
            movies.setRate(rate[x]);
            movies.setSinopsis(sinopsis[x]);
            movieList.add(movies);
        }
        moviesAdapter.setMovies(movieList);

        listViewMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MoviesDetails.class);
                intent.putExtra("movies", movieList.get(i));
                startActivity(intent);
            }
        });
    }
}
