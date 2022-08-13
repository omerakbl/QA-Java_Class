package Test_Night_025;

import MyLibrary.Library;
import Test_Night_024.Shoe;

public class AnimalObject {

    public static void main(String[] args) {

        // to be able to create a new object from class

        Animals animal1= new Animals();

        Shoe shoe1 = new Shoe(); // since this is in different package it will use import keyword to get class information

        Library.stars();
        // animal1.type = "Husky Dog";
        // animal1.name = "Doggy Dog";
        // animal1.color = "";
        // animal1.age = 0;

        // System.out.println(animal1);// Test_Night_025.Animals@1b6d3586 since we don't have any toString method
        System.out.println(animal1.age); // 0.0
        System.out.println(animal1.name); // null
        System.out.println(animal1.color); // null

        Library.stars();
        animal1.setAnimalInfo("Husky Dog", 4,"PINK","Doggy Dog");
        System.out.println(animal1.name);
        System.out.println(animal1.age);
        System.out.println(animal1.color);

        Library.stars();
        animal1.getAnimalInfo(); // Doggy Dog, 4.0, PINK, Husky Dog

        animal1.eating("watermelon");

        System.out.println(animal1);
        // after toString method ;; this will  print toString
        //Name of animal : Doggy Dog , age of animal 4.0 , Color of animal : PINK , Type of animal Husky Dog

        Shoe shoe2 = new Shoe();
        shoe2.setShoeInfo("Nike", 8,"white");
        System.out.println(shoe2);





    }
}
