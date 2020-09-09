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
public class Car {

    //car has to have make, year and model with getters and setters
    //has to have two methods, one start method and one stops method
    //make constructor of make, year and model
    private String carDetail;
    private int carYear;

    public Car() {

    }

    public Car(String carConstructor, int carConYear) {
        this.carDetail = carConstructor;
        this.carYear = carConYear;
    }

    public String getCarDetail() {
        return carDetail;
    }

    public void setCar(String carDetail) {
        this.carDetail = carDetail;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int year) {
        this.carYear = year;

    }

    public void start() {
        System.out.println("I'm in me mom's car!");
    }

    public void stop() {
        System.out.println("We got McDonald's in the house!");
    }

}
