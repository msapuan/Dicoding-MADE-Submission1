package com.sapuan.moviecataloguesub1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MoviesDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);

        ImageView detail_backPoster = findViewById(R.id.detail_back_poster);
        ImageView detail_poster     = findViewById(R.id.detail_poster);
        TextView detail_judul       = findViewById(R.id.detail_judul);
        TextView detail_tgl_rilis   = findViewById(R.id.detail_tgl_rilis);
        TextView detail_durasi      = findViewById(R.id.detail_durasi);
        TextView detail_genre       = findViewById(R.id.detail_genre);
        TextView detail_sinopsis    = findViewById(R.id.detail_sinopsis);
        TextView detail_rate        = findViewById(R.id.detail_rate);
        RatingBar detail_voting     = findViewById(R.id.detail_voting);

        Movies movies = getIntent().getParcelableExtra("movies");

        int posterMovie     = movies.getPosterMovie();
        int backPoster      = movies.getBackPoster();
        String judul        = movies.getJudul();
        String tgl_rilis    = movies.getTglRilis();
        String durasi       = movies.getDurasi();
        String genre        = movies.getGenre();
        String sinopsis     = movies.getSinopsis();
        String rate         = movies.getRate();
        float voting        = movies.getVoting();

        detail_poster.setImageResource(posterMovie);
        detail_backPoster.setImageResource(backPoster);
        detail_judul.setText(judul);
        detail_tgl_rilis.setText(tgl_rilis);
        detail_durasi.setText(durasi);
        detail_genre.setText(genre);
        detail_sinopsis.setText(sinopsis);
        detail_rate.setText(rate);
        detail_voting.setRating(voting);

        getSupportActionBar().setTitle(movies.getJudul());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
