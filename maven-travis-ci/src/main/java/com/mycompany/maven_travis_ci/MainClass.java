/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.maven_travis_ci;

import java.util.Random;

/**
 *
 * @author toka
 */
public class MainClass {
    
    public int mockingMethod(){
        return new Random().nextInt();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}
