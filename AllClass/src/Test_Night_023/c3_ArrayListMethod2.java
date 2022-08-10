package Test_Night_023;

import java.util.ArrayList;
import java.util.Collections;

public class c3_ArrayListMethod2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add( 26);
        list.add( 35);
        list.add(-55);

        // indexOf
        System.out.println(list.indexOf(26));  //  0
        System.out.println(list.indexOf(35));  //  1
        System.out.println(list.indexOf(100)); // -1 since i don't have 100 in my list it will return index number -1

        int indexnum3 = list.indexOf(-55); // 2
        System.out.println(indexnum3);

        System.out.println(list.indexOf(200)); // -1 since i don't have 200 in my list it will return index number -1

        System.out.println("****************************");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list2.indexOf("A")); // 1
        System.out.println(list2.indexOf("C")); // -1


        // contains return boolean condition
        System.out.println(list2.contains("A"));
        boolean bool1 = list2.contains("R");
        System.out.println(bool1);


        // sort that comes from import java.util.Collections; library
        System.out.println("list = " + list); // [26, 35, -55]

        //below method will ask for list and will sort.
        Collections.sort(list);
        System.out.println("Sorted list " + list);
    }
}
