package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerEmptyTest {

    @Test
    public void shouldShowLastMoviesDefault() {
        MovieManager manager = new MovieManager();
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMovies() {
        MovieManager manager = new MovieManager(5);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMoviesNullLength() {
        MovieManager manager = new MovieManager(0);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }



}