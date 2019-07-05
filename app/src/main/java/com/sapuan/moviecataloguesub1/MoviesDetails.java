package com.sapuan.moviecataloguesub1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MoviesDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);

        ImageView detailBackPoster = findViewById(R.id.detail_back_poster);
        ImageView detailPoster = findViewById(R.id.detail_poster);
        TextView detailJudul = findViewById(R.id.detail_judul);
        TextView detailTglRilis = findViewById(R.id.detail_tgl_rilis);
        TextView detailDurasi = findViewById(R.id.detail_durasi);
        TextView detailGenre = findViewById(R.id.detail_genre);
        TextView detailSinopsis = findViewById(R.id.detail_sinopsis);
        TextView detailRate = findViewById(R.id.detail_rate);

        Movies movies = getIntent().getParcelableExtra("movies");

        int posterMovie = movies.getPosterMovie();
        int backPoster = movies.getBackPoster();
        String judul = movies.getJudul();
        String tglRilis = movies.getTglRilis();
        String durasi = movies.getDurasi();
        String genre = movies.getGenre();
        String sinopsis = movies.getSinopsis();
        String rate = movies.getRate();

        detailPoster.setImageResource(posterMovie);
        detailBackPoster.setImageResource(backPoster);
        detailJudul.setText(judul);
        detailTglRilis.setText(tglRilis);
        detailDurasi.setText(durasi);
        detailGenre.setText(genre);
        detailSinopsis.setText(sinopsis);
        detailRate.setText(rate);

        Objects.requireNonNull(getSupportActionBar()).setTitle(movies.getJudul());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
