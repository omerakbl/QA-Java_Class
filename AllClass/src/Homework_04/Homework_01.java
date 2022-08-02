package Homework_04;

public class Homework_01 {
    public static void main(String[] args) {
        //    (String) Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex:  removeDup("AAABBBCCCDDD")  ==> ABCD

        String sentence="AAABBBCCCDDD";
        String result= "";

       int j=0;

      result=result+sentence.charAt(0);
        for (int i=1; i <sentence.length(); i++) {


                if(sentence.charAt(i)!=sentence.charAt(j)){
                    result=result+sentence.charAt(i);
                    System.out.println("i value;"+i);
                    System.out.println("j value;"+j);

                }
            j++;


        }
        System.out.println(result);

        }
    }

