package com.kda.collection.DZ5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film filmOne = new Film(2010, 12, "horor", 1);
        Film filmTwo = new Film(2010, 1, "qwe", 2);
        Film filmThree = new Film(2010, 12, "qwerr", 3);
        Film filmFour = new Film(2010, 11, "qwerr", 4);
        Film film5 = new Film(2010, 12, "horor", 5);
        Film film6 = new Film(2010, 1, "qwe", 6);
        Film film7 = new Film(2011, 12, "qwerr", 7);
        Film film8 = new Film(2011, 11, "qwerr", 8);
        Film film9 = new Film(2011, 12, "horor", 9);
        Film film10 = new Film(2011, 1, "qwe", 10);
        Film film11 = new Film(2011, 12, "qwerr", 11);
        Film film12 = new Film(2011, 11, "qwerr", 12);

        List<Film> listFilm2010 = new ArrayList<>();

        List<Film> listFilm2011 = new ArrayList<>();

        Cinema cinema = new Cinema();
        cinema.setCinema(filmOne, listFilm2010);
        cinema.setCinema(filmOne, listFilm2010);
        cinema.setCinema(filmTwo, listFilm2010);
        cinema.setCinema(filmThree, listFilm2010);
        cinema.setCinema(filmFour, listFilm2010);
        cinema.setCinema(film5, listFilm2010);
        cinema.setCinema(film6, listFilm2010);
        cinema.setCinema(film7, listFilm2011);
        cinema.setCinema(film8, listFilm2011);
        cinema.setCinema(film9, listFilm2011);
        cinema.setCinema(film10, listFilm2011);
        cinema.setCinema(film11, listFilm2011);
        cinema.setCinema(film12, listFilm2011);

        cinema.showCinemaYear(2010);
        cinema.showCinemaYear(2011);
        cinema.showCinemaYearAndMonth(2010,12);


        cinema.showCinemaGenre("qwerr");

        cinema.showFilmRating();

        System.out.println(cinema.getMap());
    }
}
