package br.com.java.marathon.oo.domain.methods.overload;

import static java.util.Objects.nonNull;

public class Movie {

    public static final String EMPTY_STRING = "";
    public static final int ZEROED_VALUE = 0;

    public Movie(){}
    public Movie(String name, int year, String author, String gender) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.gender = gender;
    }

    public Movie(String name, int year, String author, String gender, int rate) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.gender = gender;
        this.rate = rate;
    }
    private String name;
    private int year;
    private String author;
    private String gender;
    private int rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void printMovieData(){
        System.out.println(nonNull(this.name) ? this.name : EMPTY_STRING);
        System.out.println(nonNull(this.year) ? this.year : ZEROED_VALUE);
        System.out.println(nonNull(this.author) ? this.author : EMPTY_STRING);
        System.out.println(nonNull(this.gender) ? this.gender : EMPTY_STRING);
        System.out.println(nonNull(this.rate) ? this.rate : ZEROED_VALUE);
    }
}
