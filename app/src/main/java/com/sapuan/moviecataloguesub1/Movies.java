package com.sapuan.moviecataloguesub1;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    private String judul;
    private String tglRilis;
    private String durasi;
    private String genre;
    private String sinopsis;
    private String rate;
    private int posterMovie, backPoster;
    private float voting;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTglRilis() {
        return tglRilis;
    }

    public void setTglRilis(String tglRilis) {
        this.tglRilis = tglRilis;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getPosterMovie() {
        return posterMovie;
    }

    public void setPosterMovie(int posterMovie) {
        this.posterMovie = posterMovie;
    }

    public int getBackPoster() {
        return backPoster;
    }

    public void setBackPoster(int backPoster) {
        this.backPoster = backPoster;
    }

    public float getVoting() {
        return voting;
    }

    public void setVoting(float voting) {
        this.voting = voting;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.tglRilis);
        dest.writeString(this.durasi);
        dest.writeString(this.genre);
        dest.writeString(this.sinopsis);
        dest.writeString(this.rate);
        dest.writeInt(this.posterMovie);
        dest.writeInt(this.backPoster);
        dest.writeFloat(this.voting);
    }

    public Movies() {
    }

    protected Movies(Parcel in) {
        this.judul = in.readString();
        this.tglRilis = in.readString();
        this.durasi = in.readString();
        this.genre = in.readString();
        this.sinopsis = in.readString();
        this.rate = in.readString();
        this.posterMovie = in.readInt();
        this.backPoster = in.readInt();
        this.voting = in.readFloat();
    }

    public static final Parcelable.Creator<Movies> CREATOR = new Parcelable.Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
