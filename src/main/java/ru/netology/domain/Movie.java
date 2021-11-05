package ru.netology.domain;

public class Movie {
    int id;
    String movieName;
    String movieGenre;
    String pictureURL;
    boolean premiereTomorrow;
    public Movie(int id, String movieName, String movieGenre, String moviePictureURL, boolean premierTomorrow) {
        this.id = id;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.pictureURL = moviePictureURL;
        this.premiereTomorrow = premierTomorrow;
    }
    public Movie() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
    public String getMoviePictureURL() {
        return pictureURL;
    }
    public void setMoviePictureURL(String moviePictureURL) {
        this.pictureURL = moviePictureURL;
    }
    public boolean isPremierTomorrow() {
        return premiereTomorrow;
    }
    public void setPremierTomorrow(boolean premierTomorrow) {
        this.premiereTomorrow = premierTomorrow;
    }
}
