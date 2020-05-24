/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of square ");
        double side = in.nextDouble();
        
        Square mySquare = new Square(side);
        double squareArea = mySquare.area();
        double squarePerimeter = mySquare.perimeter();
        
        System.out.println("Area of square = " + squareArea);
        System.out.println("Perimeter of square = " + squarePerimeter);
        
        mySquare.side = 10;
        System.out.println("Area of square = " + mySquare.area());
       
        System.out.println("Enter length of rectangle ");
        double length = in.nextDouble();
        
        System.out.println("Enter width of rectangle ");
        double width = in.nextDouble();
        
        Rectangle myRectangle = new Rectangle(length, width);
        double rectangleArea = myRectangle.area();
        double rectanglePerimeter = myRectangle.perimeter();
        
        System.out.println("Area of rectangle = " + rectangleArea);
        System.out.println("Perimeter of rectangle = " + rectanglePerimeter);
        
        System.out.println("Enter radius of circle ");
        double radius = in.nextDouble();
        
        Circle myCircle = new Circle(radius);
        double circleArea = myCircle.area();
        double circleCircumference = myCircle.circumference();
        
        System.out.println("Area of circle = " + circleArea);
        System.out.println("Perimeter of circle = " + circleCircumference);
    }
}
