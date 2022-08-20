package com.kda.dz1;

public class Rectangle extends Figura {

    private int horizontal;
    private int vertical;

    public Rectangle(int horizontal, int vertical) {
        super();
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public double areaCalculation() {
        return (double) horizontal * (double) vertical;
    }

    @Override
    public void areaCalculationShow() {
        System.out.println("Данная фигура является прямоугольником");
        super.areaCalculationShow();
        System.out.println(areaCalculation());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "horizontal=" + horizontal +
                ", vertical=" + vertical +
                '}';
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }
}
