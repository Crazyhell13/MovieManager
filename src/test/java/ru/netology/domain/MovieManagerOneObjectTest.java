package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerOneObjectTest {
    private Movie first = new Movie(6, "Гарри Поттер и философский камень", "Фэнтези", "URL",false);
    @Test
    public void shouldAddMoviesDefault (){
        MovieManager manager = new MovieManager ();
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMovies (){
        MovieManager manager = new MovieManager (5);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMoviesNullLength (){
        MovieManager manager = new MovieManager (0);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesDefault (){
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMovies (){
        MovieManager manager = new MovieManager(5);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesNullLength (){
        MovieManager manager = new MovieManager(0);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }

}