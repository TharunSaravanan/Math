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
public class Circle {
    
    //properties
    double radius;
    
    // constructor
    public Circle(double r)
    {
        radius = r;
    }
    
    
    // public methods
    public double area()
    {
        return 3.14 * (radius * radius);
    }
    
    public double circumference()
    {
        return 2 * (3.14 * radius);
    }
        
}

