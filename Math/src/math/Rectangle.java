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
public class Rectangle {
    // properties 
    double Length;
    
    double Width;
    
    // constructor
    public Rectangle(double l, double w)
    {
        Length = l;
        Width = w;
    }
    
    // public methods
    public double area()
    {
        return Length * Width;
    }
    
    public double perimeter()
    {
        return (2 * Length) + (2 * Width);
    }
        
}


