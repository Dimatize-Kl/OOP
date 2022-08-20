package com.kda.dz2;

public class Planet {

    private int weight;
    private String name;
    private int radius;

    public Planet(int weight, String name, int radius) {
        this.weight = weight;
        this.name = name;
        this.radius = radius;
    }

    public void getInformationShow() {
        System.out.println("Планета называется - " + name + ", имеет массу - " + weight + ", радиус планеты - " + radius);
    }

    public double diameterCalculation(int radius) {
        return 2 * Math.PI * radius;
    }

    public void planetComparison(Planet planet) {
        if (this.weight > planet.weight) {
            System.out.println("Планета " + this.name + " имеет большую массу");
        } else if (this.weight < planet.weight) {
            System.out.println("Планета " + planet.name + " имеет большую массу");
        } else {
            System.out.println("Массы планет равны");
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }


}
