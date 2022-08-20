package com.kda.dz1;

public class Figura implements Square {

    @Override
    public void areaCalculationShow() {
        System.out.print("Площадь фигуры равна : ");
    }

    @Override
    public double areaCalculation() {
        return 0;
    }

    public void areaComparison(Figura figura) {
        if (this.areaCalculation() == figura.areaCalculation()) {
            System.out.println("Фигуры равны по площади");
        } else {
            System.out.println("Фигуры не равны по площади");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
