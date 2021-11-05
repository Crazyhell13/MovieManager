package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private Movie first = new Movie(6, "Гарри Поттер и философский камень", "Фэнтези", "URL", false);
    private Movie second = new Movie(7, "Властелин колец: Братство кольца", "Фэнтези", "URL", false);
    private Movie third = new Movie(8, "Звездные войны. Эпизод 1", "Фэнтези", "URL", false);
    private Movie fourth = new Movie(9, "Веном 2", "Фэнтези", "URL", false);
    private Movie fifth = new Movie(10, "Дюна", "Фэнтези", "URL", true);
    private Movie sixth = new Movie(11, "Головоломка", "Мультфильм", "URL", false);
    private Movie seventh = new Movie(12, "Один дома", "Комедия", "URL", false);
    private Movie eights = new Movie(13, "Кошмар на улице Вязов", "Ужасы", "URL", false);
    private Movie ninth = new Movie(14, "Мстители", "Фэнтези", "URL", false);
    private Movie tenth = new Movie(15, "Angry Birds в кино", "Мультфильм", "URL", false);
    private Movie eleventh = new Movie(7, "Помни меня", "Мелодрама", "URL", false);

    @Test
    public void shouldShowLastMoviesDefaultEmptyTest() {
        MovieManager manager = new MovieManager();
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMoviesEmptyTest() {
        MovieManager manager = new MovieManager(5);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMoviesNullLengthEmptyTest() {
        MovieManager manager = new MovieManager(0);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMoviesDefaultOneObject (){
        MovieManager manager = new MovieManager ();
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMoviesOneObject (){
        MovieManager manager = new MovieManager (5);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMoviesNullLengthOneObject (){
        MovieManager manager = new MovieManager (0);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesDefaultOneObject (){
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesOneObject (){
        MovieManager manager = new MovieManager(5);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesNullLengthOneObject (){
        MovieManager manager = new MovieManager(0);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }

    @Test //добавить фильмы - конструктор по умолчанию
    public void shouldAddMoviesDefault() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        int expected = 11;
        int actual = manager.getFilms().length;
        assertEquals(expected, actual);
    }

    @Test //добавить фильмы - настраиваемый конструктор
    public void shouldAddMovies() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        int expected = 11;
        int actual = manager.getFilms().length;
        assertEquals(expected, actual);
    }

    @Test //показать последние фильмы - конструктор по умолчанию
    public void shouldShowLastMoviesDefault() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eights, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - конструктор по умолчанию
    public void shouldShowLastMoviesDefaultMaxResult() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        Movie[] expected = new Movie[]{tenth, ninth, eights, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - конструктор по умолчанию
    public void shouldShowLastMoviesDefaultBelowMaxResult() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - настраиваемый конструктор
    public void shouldShowLastMoviesMoreThanMaxResultLength() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        Movie[] expected = new Movie[]{eleventh, tenth, ninth};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - настраиваемый конструктор
    public void shouldShowLastMoviesMaxResultLength() {
        MovieManager manager = new MovieManager(5);;
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eights, seventh};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - настраиваемый конструктор
    public void shouldShowLastMoviesBelowMaxResultLength() {
        MovieManager manager = new MovieManager(9);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test //показать последние фильмы - настраиваемый конструктор
    public void shouldShowLastMoviesMaxResultLengthNull() {
        MovieManager manager = new MovieManager(0);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eights);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eights, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
}