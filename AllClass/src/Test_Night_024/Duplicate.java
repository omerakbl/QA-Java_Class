package Test_Night_024;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {


        //Write a java program that will return duplicates data from an Array List
        // input list1 {1,2,3,4,5,1,2,10}
        // output 1,2
        // input list2 {a,b,c,d,x,e,c,d,x}
        // c,d,x

        ArrayList<String> letterList = new ArrayList<>();
        letterList.addAll(Arrays.asList("a","b","c","d","x","e","c","d","x"));

        // at the end i want to return only duplicate values
        // my output should be c , x

        ArrayList<String> duplicateLetters = new ArrayList<>(); // i will store duplicate values inside here

        // If count of letter more than 1 that means this is duplicate value

        for (int i = 0; i < letterList.size(); i++) {  // "a","b","c","d","x","e","c","d","x"

            int count = 0;

            for (String each: letterList) {

                if (each.equals(letterList.get(i))){

                    count++;
                }
            }
            if (count > 1 && !duplicateLetters.contains(letterList.get(i)) ){

                duplicateLetters.add(letterList.get(i));
            }
        }
        System.out.println("duplicateLetters = " + duplicateLetters);
    }
}
