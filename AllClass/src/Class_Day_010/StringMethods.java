package Class_Day_010;

public class StringMethods {
    public static void main(String[] args) {
        /**
         *
         * in Java, string is an object that represent a sequence of characters,
         Method              Description                                                                       Return Type
         ChatAt()            Return the character at the specified index (position)                            char
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
                             specified number of character and through the specified number of characters

         toLowerCase()       Convert a string to lower case letters                                            String
         toUpperCase()       Convert a string to upper case letters                                            String
         trim()              Remove whitespace from both ends of a string                                      String
         **/

        // substring()         Extract the characters from a string, beginning at the specified number of
        //                     character and through the specified number of characters

        String str1 = "LucasLook";
        String substr1 = str1.substring(5);
        System.out.println(substr1);
        String substr2 = str1.substring(2,5);
        System.out.println(substr2);
        String substr3 = str1.substring(3,6);

        String substr4 = str1.substring(3,str1.length());
        System.out.println(substr4);

        // toLowerCase()       Convert a string to lower case letters

        String str2 = "DoganBaBa ";
        String lowStr1 = str2.toLowerCase();
        System.out.println(lowStr1);

        // toUpperCase()       Convert a string to upper case letters

        String lowStr2 = str2.toUpperCase();
        System.out.println(lowStr2);

        // trim()              Remove whitespace from both ends of a string

        String str3 = "Lucas Look";
        String trimStr1 = str3.trim();
        System.out.println(str3);


    }
}
