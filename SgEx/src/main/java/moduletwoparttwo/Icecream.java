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
public class Icecream {

    //flavors with getters and setters
    //
    //default Con
    private String flavors;
    

    public Icecream() {

    }

    public Icecream(String flavorTwo) {
        this.flavors = flavorTwo;
        
        
    }
    public String getFlavors(){
        return flavors;
    }
    public void setFlavor(String flavor){
        this.flavors = flavor;
    }
}
