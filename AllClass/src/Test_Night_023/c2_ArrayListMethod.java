package Test_Night_023;

import java.util.ArrayList;
import java.util.Arrays;

public class c2_ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // 0

        // add(5) this will add the number to last index

        numbers.add(10);  // index 0 == 10
        numbers.add(20);  // index 1 == 20
        numbers.add(100); // index 2 == 100

        System.out.println(numbers); // [ 10,20,100 ]

        numbers.add(0,200);
        System.out.println(numbers); // [ 200,10,20,100 ]

        numbers.add(2,25); // [ 200,10,25,20,100 ]
        System.out.println(numbers);

        // add(index,number)
        // this will add the number to given index number

        // numbers.add(10,35); IndexOutOfBoundsException


        //set() this method will set the value for give index
        numbers.set(2,150);
        System.out.println(numbers);


        ArrayList<String> letters = new ArrayList<>();
        letters.add("B");
        letters.add("C");
        letters.add("E");
        letters.add("D");
        System.out.println(letters);

        letters.add(0,"A");
        System.out.println(letters);

        letters.set(4,"X");
        System.out.println(letters);


        // remove()

        letters.remove("B");
        System.out.println(letters);

        boolean bool1 = letters.remove("R"); // false
        boolean bool2 = letters.remove("C"); // true

        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println(letters); // [ A,E,X ]

        // clear()

        letters.clear();
        // clear method will clear everything in your list

        System.out.println(letters); // [ ]

        // size

        System.out.println("Letter.size() = " + letters.size());





    }
}
