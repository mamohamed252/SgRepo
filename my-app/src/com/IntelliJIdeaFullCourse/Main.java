package com.IntelliJIdeaFullCourse;


import com.IntelliJIdeaFullCourse.model.Product;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        Product product = new Product("keyboard");

        System.out.println(product.getName());
    }
}
