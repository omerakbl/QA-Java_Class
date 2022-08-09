package Test_Night_022;

import java.util.ArrayList;

public class c6_List {
    /*

    Data Structure :
        1.Array
        2. Collection ==> only accepts objects
        3. Map ==> only accepts objects



    ArrayList<DataType> listName = new ArrayList<DataType>();
    DataType can not be primitive
    they need to be wrapper class, object

    ArrayList : part of Collection

            does not support primitives, only support none primitives

            size is dynamic, automatically adjusted

            has index numbers
     */

    // what is the differences between Array and Array List
    // 1. // ArrayList: part of Collections : Array is data structure
    // 2. does not support primitives, only support none primitives but Array support primitives
    //3. size is dynamic, // but Array size is fixed

    public static void main(String[] args) {

        // ArrayList<DataType> listName = new ArrayList<DataType>();
        // DataType can not be primitive
        // they need to be wrapper class, object

        // ArrayList <int> list = new ArrayList<>(); int is primitive arraylist doesn't accept primitive

        ArrayList<Integer> list = new ArrayList<>(); //size is equal 0 ;

        // add() that will add data inside the list
        list.add(10);  // size 1    index 0
        list.add(100); // size 2    index 1
        list.add(259); // size 3    index 2
        list.add(250); // size 4    index 3
        System.out.println(list);

        int [] numbers = new int[5] ; // size is fixed

        // get() that will give you specific index number value

        Integer num1 = list.get(0);
        System.out.println(num1); // 10
        System.out.println(list.get(3)); // 250
        // System.out.println(list.get(4)); // IndexOutOfBoundsException


        // list.get(1) will return wrapper object
        // unboxing will help you to store wrapper object as a primitive data
        int num2 = list.get(1);
        System.out.println(num2);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Lucas");
        nameList.add("Omer");
        nameList.add("Osman");
        nameList.add("Nik");        //  size 4 here

        System.out.println(nameList);

        // size() method that will give us size of arrayList
        // lastindec is always 1 number smaller then size or length

        System.out.println("Names are : ");
        for (int i = 0; i <= nameList.size() -1 ; i++) { // 0 1 2 3

            System.out.println(nameList.get(i)); // 0 1 2 3
         // System.out.println(nameList.get[i]); if list was an array

        }

        System.out.println("*******************");

        for (String name : nameList) {

            System.out.println(name);

        }

        int size1 = nameList.size();

        System.out.println("size 1 : " + size1);

        nameList.add("Java");

        int size2 = nameList.size();

        System.out.println("size 2 : " + size2);

    }

}
