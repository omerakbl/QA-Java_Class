package Test_Night_020;

public class c3_ReturnMethods {
    public static void main(String[] args) {

        String firstName = "Lucas";
        String lastName = "Exe";

        System.out.println(concatNames(firstName,lastName));

        System.out.println(equalName("Osman", "Lucas"));

        System.out.println(concatNumbers(20,30));

    }
    // first concat 2 string and then print me 3 letter from string

    // create a return method that will concat 2 different string

    public static String concatNames(String name1, String name2){


        return name1.concat(name2);
    }

    public static String concatNumbers (int number1, int number2){

        return "" + number1 + number2;
    }

    //create a logic that will check given names are equal

    public static boolean equalName (String name1, String name2){

        // return type needs to be boolean since method return type is boolean
        // return true;

        return name1.equals(name2);

    }
}
