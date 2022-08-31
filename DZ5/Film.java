package com.kda.collection.DZ5;

import java.util.Objects;

public class Film {

    // private static int filmId;
    private int year;
    private int mount;
    private String genre;
    private double rating;

    public Film(int year, int mount, String genre, double rating) {
        this.year = year;
        this.mount = mount;
        this.genre = genre;
        this.rating = rating;

    }

    public int getYear() {
        return year;
    }

    public int getMount() {
        return mount;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                ", year=" + year +
                ", mount=" + mount +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return year == film.year && mount == film.mount && Double.compare(film.rating, rating) == 0 && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, mount, genre, rating);
    }
}


