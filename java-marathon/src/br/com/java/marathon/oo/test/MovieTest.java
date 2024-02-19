package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.methods.overload.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.initMovie("Sherlock Holmes", 1887,"Arthur Conan Doyle" );
        movie.initMovie("Sherlock Holmes", 1887,"Arthur Conan Doyle", "Action");
        movie.printMovieData();

        /** Just for academic reasons created initMovie method for method overloading
         * movie.setName("Sherlock Holmes");
         * movie.setYear(1887);
         * movie.setAuthor("Arthur Conan Doyle");
         * movie.printMovieData(); **/
    }
}
