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
public class finalshape {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.area(4, 5));
        System.out.println(square1.perimeter(4, 5));
        System.out.println(square1.color("blue"));
        
        
        Triangle triangle = new Triangle();
        System.out.println(triangle.area(2, 2));
        System.out.println(triangle.perimeter(2, 2));
        System.out.println(triangle.color("orange"));
        
        
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.area(2, 2));
        System.out.println(rectangle1.perimeter(2, 2));
        System.out.println(rectangle1.color("red"));
    }
    
}
