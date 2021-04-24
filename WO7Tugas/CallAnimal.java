/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO7Tugas;

/**
 *
 * @author RifqiFebri
 */
public class CallAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       class Animal {
    public void makeNoise() {
        System.out.println("talk");
    }
 } 
        
      class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }      
}      
        Animal animal = new Animal ();
        animal.makeNoise();
        
        Dog dog = new Dog();
        dog.makeNoise();
        
        Animal animaldog = new Dog();
        animaldog.makeNoise();
        
        Dog animaldogs = new Dog ();
        
        if (animal instanceof Animal)
            System.out.println("animal is Animal");
        
        if (dog instanceof Animal)
            System.out.println("dog is Animal");
        
        if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal");
        
        if (animaldogs instanceof Dog)
            System.out.println("animal is Dog");
    }
    
}
