package com.example.recyclerview;

public class Movie {
    private String name;
    private String genre;
    private String year;

    public Movie(String name, String genre, String year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }
}
