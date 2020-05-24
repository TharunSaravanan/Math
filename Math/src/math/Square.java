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
public class Square {
    
    // properties 
    double side;
    
    // constructor
    public Square(double s)
    {
        side = s;
    }
    
    // public methods
    public double area()
    {
        return side * side;
    }
    
    public double perimeter()
    {
        return 4 * side;
    }
        
}
