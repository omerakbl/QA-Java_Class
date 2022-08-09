package Homework_09;

public class Homework_028 {
    public static void main(String[] args) {
        /*
        Write a method where it takes a String and returns to a String by adding "Not" in front of the
        String only if It does not have "Not" in front of it already.

        ex. a = "CAR'
        notString("Car" )  == > "Not Car"
        notString("Home"). ==> "Not Home"
        notString("Not Home") == > "Home"
         */
        met("home");
        met("Not Home");


    }

    public static void met(String name){

        if (name.contains("Not") ){
            System.out.println(name.replace("Not", ""));

        } else {
            System.out.println("Not " + name);
        }
    }
}
