/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author tharun
 */
public class RegularHexagon {
    
    double side;
    
    // Constructor
    public RegularHexagon(double s) 
    {
        side = s;
    }
    
    // Public Methods
    public double perimeter() 
    {
        return 6 * side;
    }
    
    public double area() 
    {
        // Key number to Area Formula
        return 2.6 * (side * side);
    }
}
