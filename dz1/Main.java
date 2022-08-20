package com.kda.dz1;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Triangle(4, 2);
        Figura figuraTwo = new Triangle(8, 2);

        Figura figuraThree = new Rectangle(5, 5);
        Figura figuraFour = new Rectangle(2, 2);

        figura.areaCalculationShow();
        figuraThree.areaCalculationShow();
        figura.areaComparison(figuraThree);
        figura.areaComparison(figuraFour);


        ShapeUtils.triangleDefinitions(figura);
        ShapeUtils.triangleDefinitions(figuraThree);

        Figura figuraFive = new Figura();
        ShapeUtils su = new ShapeUtils();


        System.out.println(figura.toString());
        System.out.println(figuraThree.toString());
        System.out.println(figuraFive.toString());
        System.out.println(su.toString());


    }


}
