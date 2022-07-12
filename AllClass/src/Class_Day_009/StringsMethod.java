package Class_Day_009;

public class StringsMethod {
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

        // ChatAt()            Return the character at tge specified index (position)

        String name = "Renas";
        String str = "Renas";
        char firstL = str.charAt(0);
        System.out.println(firstL);

        // concat()            Appends a string to the end of another string

        String str1 = "name0";
        String str2 = "name1";
        String str3 = "Lucas";

        String str4 = str1.concat(str2);
        System.out.println(str4);

        String str5 = str.concat( " " + str2).concat( " " + str3);
        System.out.println(str5);

        // contains()          Checks whether a string contains a sequence of characters

        String name1 = "Lucas";
        boolean YN = name1.contains("L");
        System.out.println(YN);

        // endsWith()          Checks whether a string ends with the specified characters

        boolean YN1 = name1.endsWith("s");
        System.out.println(YN1);

        // equals()            Compares two strings. Return true if the strings are equal, and false if not

        String name2 = "Sam";
        String name3 = "sam";

        boolean YN2 = name2.equals(name3);
        System.out.println(YN2);

        // equalsIgnoreCase()  Compare two strings, ignoring case considerations

        System.out.println(name2.equalsIgnoreCase(name3));

        // indexOf()           Returns the position of the first found occurrence

        String name4 = "banana";
        int ind = name4.indexOf('a');
        System.out.println(ind);

        // isEmpty()           Checks whether a string is empty or not

        String emp = " ";
        System.out.println(emp.isEmpty());

        // lastIndexOf()       Returns the position of the last found occurrence

        int lst =  name4.lastIndexOf('a');
        System.out.println(lst);

        // length()            Returns the length of a specified strings




        // replace()           Searches a string for a specified values, and returns a new string where the specified values are replaced








    }
}
