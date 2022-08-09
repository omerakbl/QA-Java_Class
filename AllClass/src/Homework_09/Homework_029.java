package Homework_09;

public class Homework_029 {
    /*
    Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
    but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.

ex -  ConcatandPrint("FirstName","LastName") it will return ==> FirstNameLastName
  	  ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName" and "Lastname" 3 times.
     */

    public static void main(String[] args) {

        par1("omer","asdas", 5);
    }
    public static void par1(String Name, String Lastname, int times){

        int x = 0;
        do {
            if (times == 0) {
                System.out.println(Name.concat(Lastname));
                break;
            }

            System.out.println(Name.concat(Lastname));
            x++;
        }
        while( x != times);

    }
}
