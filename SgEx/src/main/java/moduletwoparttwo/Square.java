/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduletwoparttwo;

/**
 *
 * @author Mohamed
 */
public class Square implements Shape{

    @Override
    public void getArea(int length, int height) {
        int area = (length * height);
        System.out.println(area);
    }

    @Override
    public void getPerimeter(int side) {
       int perimeter = (side * 4);
        System.out.println(perimeter);
    }
    
}
