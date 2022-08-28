package com.kda.collection.DZ4;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> mapCar = new HashMap<>();


    public Map<Car, Integer> parking(Car car) {
        if (mapCar.containsKey(car)) {
            mapCar.put(car, mapCar.get(car) + 1);
        } else {
            mapCar.put(car, 1);
        }
        System.out.println("Автомобиль " + car.toString() + " приехал на парковку");
        return mapCar;
    }

    public Map<Car, Integer> departure(Car car) {
        if (mapCar.containsKey(car)) {
            mapCar.put(car, mapCar.get(car) - 1);
        }
        System.out.println("Автомобиль " + car.toString() + " покинул парковку");
        return mapCar;
    }

    public void infoAutoCount(Map<Car, Integer> map, Car car) {
        System.out.println("Количество таких автомобилей на парковке составляет: " + map.get(car));

    }


}
