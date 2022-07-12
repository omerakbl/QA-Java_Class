package Test_Night_008;

public class StringMethods {
    public static void main(String[] args) {
        /**
         *
         * in Java, string is an object that represent a sequence of characters,
         Method              Description                                                                       Return Type
         ChatAt()            Return the character at tge specified index (position)                            char
         concat()            Appends a string to the end of another string                                     String
         contains()          Checks whether a string contains a sequence of characters                         boolean
         endsWith()          Checks whether a string ends with the specified characters                        boolean
         equals()            Compares two strings. Return true if the strings are equal, and false if not      boolean

         equalsIgnoreCase()  Compare two strings, ignoring case considerations                                 boolean
         indexOf()           Returns the position of the first found occurrence                                int
         of specified characters in a string


         isEmpty()           Checks whether a string is empty or not                                           boolean
         lastIndexOf()       Returns the position of the last found occurrence                                 int
         of specified characters in a string


         length()            Returns the length of a specified strings                                         int
         replace()           Searches a string for a specified values, and returns a new                       String
         string where the specified values are replaced

         replaceFirst()      Replaces the first occurrence of a substring that matches                         String
         the given regular expression with given replacement

         startsWith()        Checks whether a string starts with specified characters                          boolean
         substring()         Extract the characters from a string, beginning at the                            String
         specified number of character and through the specified number of chracters

         toLowerCase()       Convert a string to lower case letters                                            String
         yoUpperCase()       Convert a string to upper case letters                                            String
         trim()              Remove whitespace from both ends of a string                                      String
         **/



        // ChatAt()         Return the character at tge specified index (position)
        String str = "Hello";
                     //01234
        // index number starts from 0 in java
        str.charAt(0); // H
        char ch = str.charAt(0);
        System.out.println(ch);

        char ch2 = str.charAt(3);
        System.out.println(ch2); // StringIndexOutOfBoundsException because string range is 0-4
        System.out.println(str.charAt(2));

        String word= "Hello World";

        System.out.println(word.charAt(5));

        // concat()               Appends a string to the end of another string
        String firstName="";


    }
}
