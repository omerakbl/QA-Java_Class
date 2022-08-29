package Test_Night_025;

import MyLibrary.Library;
import Test_Night_024.Shoe;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println(shoe2); // this will print to string of shoe


        Animals animal2 = new Animals();
        animal2.setAnimalInfo("bird" , 2, "red", "Birdy");

        Animals animal3 = new Animals();
        animal3.setAnimalInfo("Cat" , 4, "white", "Tom");

        Animals animal4 = new Animals();
        animal4.setAnimalInfo("Mouse", 3,"gray", "Jerry");

        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);

        Library.stars();
        ArrayList<Animals> animalList = new ArrayList<>();
        animalList.addAll(Arrays.asList(animal1,animal2,animal3,animal4));

        for (int i = 0; i < animalList.size(); i++) {

            System.out.println(animalList.get(i).name);

        }

        for (Animals each : animalList) {

            System.out.println(each.age);

        }

        // Animals []

        Animals [] animalsAArr = {animal1,animal2,animal3,animal4};

        String food1 = "Banana";
        String food2 = "Watermelon";
        String food3 = "Bread";
        String food4 = "cheese";

        animal1.eating(food1);

        for (Animals each: animalsAArr) {

            each.getType();
            each.eating(food2);

        }





    }
}
