package Test_Night_021;

import java.util.Arrays;

public class c3_Overloading3 {
    public static void main(String[] args) {
        int [] numbers = {2,5,3,0,-10};
        String [] names = {"asdas","dasdas","qwer","asdf"};
        char [] letters = {'a','f','b','x','c'};


        //lets import some library import java.util.Arrays;
        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        System.out.println(concatStrings("Hello","Java"));
        System.out.println(concatStrings("Hello","Java","Woow"));

    }

    public static String concatStrings (String str1, String str2){

        return str1.concat(str2);

    }

    public static String concatStrings(String str1, String str2, String str3){

        return str1.concat(str2).concat(str3);
    }
}
