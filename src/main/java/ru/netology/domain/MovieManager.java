package ru.netology.domain;

public class MovieManager {
    private Movie[] films = new Movie[0];

    public Movie[] getFilms() {
        return films;
    }
    private int maxResultLength;
    public int getMaxResultLength() {
        return maxResultLength;
    }
    public void setMaxResultLength(int maxResultLength) {
        this.maxResultLength = maxResultLength;
    }
    //конструкторы
    public MovieManager(int maxResultLength) {
        if (maxResultLength <= 0) {
            this.maxResultLength = 10;
        } else {
            this.maxResultLength = maxResultLength;
        }
    }
    public MovieManager() {
        maxResultLength = 10;
    }
    public void addMovie (Movie item){
        int length = films.length + 1;
        Movie[] newArray = new Movie[length];
        for (int i = 0; i < films.length; i++) {
            newArray[i] = films[i];
        }
        int lastIndex = newArray.length - 1;
        newArray[lastIndex] = item;
        films = newArray;
    }
    public Movie[] showLastMovies(){
        int resultLength;
        if (this.getMaxResultLength()> films.length) {
            resultLength = films.length;
        } else {
            resultLength = getMaxResultLength();
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++){
            int index = films.length - i -1;
            result[i] = films[index];
        }
        return result;
    }

}
