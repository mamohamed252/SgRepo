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
public class Rectangle implements Shape {

    @Override
    public int area(int a, int b) {
        int area = a * b;
        return area;
        
        
    }

    @Override
    public int perimeter(int a, int b) {
        int perimeter = a * 2 + b * 2;
        return perimeter;
     
    }

    @Override
    public String color(String color) {
        return color;
    }
     
  
          
    
    
}
