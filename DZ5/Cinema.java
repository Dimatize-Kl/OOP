package com.kda.collection.DZ5;

import java.util.*;

public class Cinema {

    private Map<Integer, List<Film>> map = new HashMap<>();

    public void setCinema(Film film, List<Film> list) {
        if (!list.contains(film)) {
            list.add(film);
            map.put(film.getYear(), list);
            System.out.println("Фильм добавлен в кинотеатр");
        } else {
            System.out.println("Такой фильм уже есть");
        }
    }

    public void showCinemaYear(int year) {
        System.out.println("По выбраному году кинотеатр имеет фильмы: " + map.get(year));
    }

    public void showCinemaYearAndMonth(int year, int month) {
        List<Film> list = map.get(year);
        for (Iterator<Film> iterator = list.iterator(); iterator.hasNext(); ) {
            Film film = iterator.next();
            if (film.getMount() == month) {
                System.out.println("Фильмы данного года и месяца выпуска: " + film);
            }
        }
    }

    public void showCinemaGenre(String genre) {
        Set<Integer> set = map.keySet();
        for (int key : set) {
            int keyNew = key;
            List<Film> list = map.get(key);
            for (Film film : list) {
                Film filmNew = film;
                if (film.getGenre().equals(genre)) {
                    System.out.println("Фильмы по жанру : " + film);
                }
            }
        }
    }

    public void showFilmRating() {

        List<Film> listFilm = new ArrayList<>();

        Set<Integer> set = map.keySet();
        for (int key : set) {
            int keyNew = key;
            List<Film> list = map.get(key);
            for (Film film : list) {
                Film filmNew = film;
                listFilm.add(film);
            }
        }
        listFilm.sort(Comparator.comparing(Film::getRating).reversed());
        if (listFilm.size() > 10) {
            listFilm.subList(10, listFilm.size()).clear();
            System.out.println(listFilm);
        } else {
            System.out.println(listFilm);
        }
        System.out.println(listFilm.size());
    }

    public Map<Integer, List<Film>> getMap() {
        return map;
    }
}
