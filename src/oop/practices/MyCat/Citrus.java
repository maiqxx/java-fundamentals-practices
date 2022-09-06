/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.practices.MyCat;

public class Citrus {
    
    
    String name = "Citrus";
    String color = "Orange";
    int age;
    int weight;
    int cuteness;
    
    void theName(){
        System.out.println("Name: " + name);
    }
    
    void theColor(){
        System.out.println("Color: " + color);
    }
    
    void theAge(int age){
        System.out.println("How old? " + age + " yrs.");
    }
    
    void theWeight(int weight){
        System.out.println("Heaviness: " + weight + "kg.");
    }
    
    void levelOfCuteness(int cuteness){
        System.out.println("Level of cuteness: " + cuteness + "%");
    }
}
