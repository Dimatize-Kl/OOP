package com.kda.dz1;

public class ShapeUtils {

    public static void triangleDefinitions(Figura figura) {
        if (figura.getClass().toString().endsWith("Triangle")){
            System.out.println("Является треугольником");
        } else if (figura.getClass().toString().endsWith("Rectangle")){
            System.out.println("Является прямоугольником");
        } else {
            System.out.println("Это неизвестная фигура");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
