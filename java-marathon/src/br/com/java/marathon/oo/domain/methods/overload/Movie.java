package br.com.java.marathon.oo.domain.methods.overload;

public class Movie {

    public Movie(){

    }

    public Movie(String name, int year, String author, String gender) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.gender = gender;
    }

    private String name;
    private int year;
    private String author;
    private String gender;

    public void initMovie(String name, int year, String author){
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public void initMovie(String name, int year, String author, String gender){
        this.name = name;
        this.year = year;
        this.author = author;
        this.gender = gender;
    }

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

    public void printMovieData(){
        System.out.println(this.name);
        System.out.println(this.year);
        System.out.println(this.author);
        System.out.println(this.gender);
    }

}
