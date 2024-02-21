package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.methods.overload.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie foo = new Movie("Foo", 0000, "Bar", "Action");
        Movie bar = new Movie("Bar", 0000, "Foo", "Action", 10);
        foo.printMovieData();
        bar.printMovieData();
    }
}
