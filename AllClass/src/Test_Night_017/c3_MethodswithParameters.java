package Test_Night_017;

import java.util.Scanner;

public class c3_MethodswithParameters {

    /*
         declaration of the method
         public                   static               void                 main                (String[] args){
         Access-modifier          specifier            return-type         method-Name          (parameter){
         statements , code
         }

     */

    public static void main(String[] args) {
        // hello method is without parameters
        hello(); // no need to pass anything inside ()

        //afeCategory method created with parameter which is int age
        ageCategory(-100); // method will ask you a int number to be ale to run
        // method will take that int number and sent it inside of method

        ageCategory(3);
        ageCategory(20);
        ageCategory(60);
        ageCategory(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int number = sc.nextInt();
        ageCategory(number); // this number will be assigned to int age that we have inside method

    }
    public static void hello(){
        System.out.println("Hello");
    }

    // create a method that will check given age and print the category of each age
    // if age is 0-5 baby
    // if age is 5-18 young
    // if age is 18-80 mature
    // if age is greater than 80 print old

    // now mt method should accept an age so i can check age category

    // void methods                   with parameters
    public static void ageCategory(int age){

        if (age >= 0 && age < 5){
            System.out.println( age + " is baby");
        } else if (age>= 5 && age < 18) {
            System.out.println( age + " is young");
        } else if (age >= 18 && age < 80) {
            System.out.println(age + " is mature" );
        } else if (age>= 80) {
            System.out.println(age + " is old");
        }else { // anything left will be invalid number which is negative number
            System.out.println(age + " is not exist");
        }
    }

}
