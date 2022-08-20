package com.kda.dz1;

public class Triangle extends Figura {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public void areaCalculationShow() {
        System.out.println("Данная фигура является треугольником");
        super.areaCalculationShow();
        System.out.println(areaCalculation());
    }

    @Override
    public double areaCalculation() {
        return (double) base * (double) height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
