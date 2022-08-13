package Test_Night_024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExtra {

    //All of those Collections method will work any arraylist-type String,Double,Integer ,Boolean ....
    // Collections Class:
    //
    //        sort(CollectionType): this will sort any given collectionType
    //
    //        frequency(CollectionType, Object): this will return the frequency of the given object
    //        from the given collectionType
    //
    //        max(CollectionType): this will return the biggest object from Collectiontype
    //
    //        min(CollectionType): this will return the smallest object from Collectiontype
    //
    //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
    //
    //        replaceAll(CollectionType, oldData, newData):

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,100,-25,-55,-75,189));

        //        max(CollectionType): this will return the biggest object from Collectiontype
        //
        //        min(CollectionType): this will return the smallest object from Collectiontype

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        Integer maxNumberFromList = 189;

        System.out.println(maxNumber);
        System.out.println(minNumber);

        numbers.remove(maxNumberFromList);
        System.out.println(Collections.max(numbers)); // Second max number

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(100,25,35,55));

        //        swap(CollectionType, index1, index3): this will swap the index1 and index 3

        Collections.swap(numbers2,0,2);

        System.out.println(numbers2);

        ArrayList<Double> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(2.5,5.5,10.5,5.5,5.5,2.5,11.5,25.3));

        System.out.println(numbers3);

        Collections.replaceAll(numbers3, 5.5 , 0.5);
        System.out.println(numbers3);
    }



}
