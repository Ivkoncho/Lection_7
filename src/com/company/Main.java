package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Circle circle1 = new Circle();

        Circle circle2 = new Circle(3.5);


        System.out.println("Area of circle for first object circle1 with radius 0="+circle1.getArea());

        System.out.println("Area of circle for second object circle2="+circle2.getArea());

        circle1.setRadius(1.5);

        System.out.println("Area of circle for first object circle1 with radius 1.5="+circle1.getArea());

        System.out.println("Area of circle for first object circle1 with radius 1.5="+circle1.getperimeter());


    }
}
