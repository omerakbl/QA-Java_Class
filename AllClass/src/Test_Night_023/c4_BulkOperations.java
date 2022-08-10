package Test_Night_023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c4_BulkOperations {

    /*
        Bulk Operations:

        ContainsAll(CollectionType) :

        addAll(CollectionType):

        removeAll(CollectionType):

        retainAll(CollectionType):

     */

    public static void main(String[] args) {
        //addAll : will add multiple object in your list

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(2,3,4,5,10,20,25));
        // in arraylist we will use addAll method to add multiple numbers
        System.out.println("Before adding num1 array :  " + numbers); // [2,3,4,5,10,20,25]

        //in array you create container and pass multiple numbers
        Integer [] num1 = {0,1,10,20,30,40,4};
        numbers.addAll(Arrays.asList(num1));
        System.out.println("After adding num1 array :  " + numbers); // [ 2,3,4,5,10,20,25 ] + [ 0, 1, 10, 20, 30, 40, 4]
        // [ 2,3,4,5,10,20,25, 0, 1, 10, 20, 30, 40, 4]
        Collections.sort(numbers);
        System.out.println(numbers); // [0, 1, 2, 3, 4, 4, 5, 10, 10, 20, 20, 25, 30, 40]


        // ContainsAll : this will check if objects are contains in the list

        // contains will check only one number
        System.out.println("numbers.contains(0) = " + numbers.contains(0));

        System.out.println("numbers.containsAll(Arrays.aslist(0,10,20) = " + numbers.containsAll(Arrays.asList(0,10,20)));

        // contains and containsAll will return boolean condition
        boolean bool1 = numbers.containsAll(Arrays.asList(0,1,100)); // false
        System.out.println("bool1 = " + bool1);

        Integer [] num2 = {20,25};
        System.out.println("numbers.containsAll(Arrays.asList(num2)) = " + numbers.containsAll(Arrays.asList(num2)));

        System.out.println("numbers.contains(num2) = " + numbers.contains(num2));


        // removeAll : this will remove all the list from arraylist you have
        // remove : which is removing one data each time

        ArrayList<Integer> numberList2 = new ArrayList<>();

        numberList2.addAll(Arrays.asList(1,2,3,4,5,4,5,6,4,4,4,7,8,8,10));

        Integer number = 4;
        numberList2.remove(number); // first 4 will be removed
        System.out.println(numberList2);
        numberList2.removeAll(Arrays.asList(8)); // this will remove all 8 from list
        System.out.println(numberList2); // [1, 2, 3, 5, 4, 5, 6, 4, 4, 4, 7, 10

        numberList2.removeAll(Arrays.asList(4));
        System.out.println(numberList2); // [1, 2, 3, 5, 5, 6, 7, 10]

        System.out.println("*********************");


        // retainAll : will search for given data, and it will keep them other will be removed

        ArrayList<Integer> numberlist3 = new ArrayList<>();

        numberlist3.addAll(Arrays.asList(0,0,0,1,1,1,2,3,4,5,6));
        System.out.println(numberlist3);

        System.out.println(numberlist3.containsAll(Arrays.asList(0,1,2,3))); // true

        //to remove all zero from list
        numberlist3.removeAll(Arrays.asList(0));
        System.out.println(numberlist3); // [1, 1, 1, 2, 3, 4, 5, 6]

        numberlist3.retainAll(Arrays.asList(1,5));
        System.out.println(numberlist3); // [1, 1, 1, 5]



    }
}
