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
public class RegularPentagon {
    
    double side;
    
    // Constructor
    public RegularPentagon(double s) 
    {
        side = s;
    }
    
    public double perimeter() 
    {
        return 5 * side;
    }
    
    public double area() 
    {
        return 1.72 * (side * side);
    }
}
