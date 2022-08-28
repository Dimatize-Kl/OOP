package com.kda.collection.DZ4;

public class Main {

    public static void main(String[] args) {
        Mazda mazdaOne = new Mazda("mazda", "3", 2012, "dark silver");
        Mazda mazdaTwo = new Mazda("mazda", "3", 2012, "dark silver");
        Mazda mazdaThree = new Mazda("mazda", "6", 2010, "red");

        Garage garage = new Garage();

        garage.parking(mazdaOne);
        garage.parking(mazdaTwo);
        garage.parking(mazdaThree);

        //System.out.println(garage.mapCar);

        garage.infoAutoCount(garage.mapCar, mazdaTwo);

        garage.departure(mazdaTwo);
       // System.out.println(garage.mapCar);

        garage.infoAutoCount(garage.mapCar, mazdaTwo);
    }
}
