package com.kda.dz2;

public class Earth extends Planet implements Weather {

    private int population;

    public Earth(int weight, String name, int radius, int population) {
        super(weight, name, radius);
        this.population = population;
    }

    @Override
    public void getInformationShow() {
        super.getInformationShow();
        System.out.println("Население планеты - " + population);
    }

    @Override
    public void rain() {
        System.out.println("На " + getName() + " начинается дождь");
    }

    @Override
    public void wind() {
        System.out.println("На " + getName() + " начинается ветер");
    }

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                '}';
    }
}
