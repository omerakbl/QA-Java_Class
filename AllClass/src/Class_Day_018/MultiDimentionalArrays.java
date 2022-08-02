package Class_Day_018;

public class MultiDimentionalArrays {
    public static void main(String[] args) {

        // Arrays having arrays as values or having multiple array nested inside each other

        // DataType [] name = {.......}
        // DataType [] [] name = { {.....}, {.......} }

                    int [] [] name1 = { {12,34,56,78},{78,89,23,11} };
        // The index of outer array           0              1
        // The index of inner array     { 0, 1, 2, 3}  {0, 1, 2, 3}

        int b = name1 [1] [1];

        System.out.println("The number in the provided indexes is : " + name1 [1] [1]);






    }
}
