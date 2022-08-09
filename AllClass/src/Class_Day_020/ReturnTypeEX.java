package Class_Day_020;

public class ReturnTypeEX {

    // Write a method where it gets an Array of int as input parameter and returns to the max number in Array

    public static void main(String[] args) {

        int [] arr1 = {-90,-30,-20,-35};
        int maximum = Max(arr1);
        System.out.println("The Max value is : " + maximum);
        System.out.println("The other way of printing it : " + Max(arr1));

        // add 5 to the maximum value;

        int addedversion = Max(arr1)+5;

        System.out.println("Added version is : " + addedversion);


    }

    // The method starts here

    public static int Max (int [] JustName){
        int max = JustName[0];
        for (int x:JustName)
        {
            if (max < x){
                max = x;
            }
        }
        return max;
    }
}
