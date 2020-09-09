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
public class App {
    // create instance of car and call each one
    // call start and stop
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setCar("Red Nissan Altima");
        String carString = myCar.getCarDetail();
        System.out.println(myCar.getCarDetail());
        System.out.println(carString);
        myCar.setCarYear(1999);
        int year = myCar.getCarYear();
        System.out.println(year);
       
        
        myCar.start();
        myCar.stop();
        
        Car newCar = new Car("Range Rover", 2000);
       
        System.out.println(newCar.getCarDetail() + " " + newCar.getCarYear());
        
        
        Icecream myChoiceOne = new Icecream();
        myChoiceOne.setFlavor("Chocolate");
        String pickOne = myChoiceOne.getFlavors();
        System.out.println(pickOne);
        
        Icecream myChoiceTwo = new Icecream("Vanilla");
        System.out.println(myChoiceTwo.getFlavors());
    }
    
}
