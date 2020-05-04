/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module2;

/**
 *
 * @author Mohamed
 */
public class MidSizeSedan implements Vehicle, Trackable{
    @Override 
    public void moveForward(int milesPerHour) {
        // implement code here
    }
    
    @Override
    public void moveBackward(int milesPerHour) {
        //implementation code 
    }
    
    @Override
    public void stop() {
        //put code here
    }
    
    @Override
    public void turnLeft() {
        //put code here
    }
    
    @Override
    public void turnRight() {
        //put code here
    }
    
    @Override
    public void engineOn() {
        System.out.println("Engine turn on");
        
    }
    
    @Override
    public void engineOff() {
        //put code here
    }

    @Override
    public void sendCurrentLocation() {
        
    }

    @Override
    public void beaconOn() {
        
    }

    @Override
    public void beaconOff() {
        
    }
}
