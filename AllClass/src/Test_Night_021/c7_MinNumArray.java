package Test_Night_021;

public class c7_MinNumArray {

    // write a return method that can return minimum number from an int array

    public static void main(String[] args) {
        int [] arr1 = {10,20,2,100,95};
        double [] arr2 = {1.0,2.0,2.5,10.0,9.5};

        int result = minNumber(arr1);
        double result2 = minNumber(arr2);
        System.out.println(result);
        System.out.println(result2);

    }

    public static int  minNumber (int [] numbers){
        // first you will assume one number as a minumum number;

        int minimum = numbers[0];

        for (int eachNumber: numbers) {
            if (eachNumber<minimum){
                minimum = eachNumber;
        }

        }
        return minimum;

    }

    // write a method that will return minimum number from double array
    // apply overloading

    public static double minNumber(double [] numbers){

        double minimum = numbers[0];

        for (double eachNumber: numbers) {
            if (eachNumber<minimum){
                minimum = eachNumber;
            }

        }
        return minimum;

    }
}
