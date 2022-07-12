package Test_Night_008;

public class StringMethods {
    public static void main(String[] args) {
        /**
        Method              Description
        ChatAt()            Return the character at tge specified index (position)
        concat()            Appends a string to the end of another string
        contains()
        endsWith()
        equals()

        length()
        replace()

        replaceFirst()

        startsWith()
        substring()         Extract the characters from a string,
                            beginning at the specified number of character
                            and

        toLowerCase()       Convert a string to lower case letters
        yoUpperCase()       Convert a string to upper case letters
        trim()              Remove whitespace from both ends of a string
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
