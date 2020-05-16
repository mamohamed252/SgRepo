/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module2.shapes;

/**
 *
 * @author Mohamed
 */
public class Triangle implements Shape {

    @Override
    public int area(int a, int b) {//1/2 b * h
        double area = (a*b) * 0.5;
        double areaInt = area;
        
        // doing this will cut off anything after decimal. Don't use, this was only for this ex.
        return (int) area;

    }

    @Override
    public int perimeter(int a, int b) {//a2 + b2 = c2
        
        double cSquared = (a * a) * (b * b);
        double cRoot = Math.sqrt(cSquared);
        double perimeter = ( a + b + cRoot); 
        // doing this will cut off anything after decimal. Don't use, this was only for this ex.
        return (int) perimeter;

    }

    @Override
    public String color(String color) {
        return color;
    }
}
