package com.sapuan.moviecataloguesub1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MoviesAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<Movies> listMovies;

    MoviesAdapter(Context context) {
        this.context = context;
        listMovies = new ArrayList<>();
    }

    void setMovies(ArrayList<Movies> listMovies) {
        this.listMovies = listMovies;
    }

    @Override
    public int getCount() {
        return listMovies.size();
    }

    @Override
    public Object getItem(int position) {
        return listMovies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.list_item_movies, parent, false);

        ImageView img_poster = view.findViewById(R.id.poster_movies);
        TextView tv_judul = view.findViewById(R.id.judul_movies);
        TextView tv_tglRilis = view.findViewById(R.id.tgl_rilis);
        TextView tv_genre = view.findViewById(R.id.genre_movies);
        TextView tv_rate = view.findViewById(R.id.rate);

        Movies movies = (Movies) getItem(position);
        img_poster.setImageResource(movies.getPosterMovie());
        tv_judul.setText(movies.getJudul());
        tv_tglRilis.setText(movies.getTglRilis());
        tv_genre.setText(movies.getGenre());
        tv_rate.setText(movies.getRate());

        return view;
    }
}
