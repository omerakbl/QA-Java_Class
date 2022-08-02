package Class_Day_015;

public class ArrayCont {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The first number is : " + nums[0]);

        nums[0] = 11; // this will reassign the index 0 ( value of 1 ) to ( value if 11 )
        System.out.println("the first number is : " + nums[0]);

        // If I want to initialize an array but assign the value later
        // int [] name = int[size]

        // int [] numbers = new int[10]; // Java will create an array that has the default value for each index

        // for the numbers tge default value are 0, ( int, byte, long ) 0.0 ( float, double )

        int []  numbers = new int[10]; // {0,0,0,0,0,0,0,0,0,0}
        float [] flnums = new float[10]; // {0.0, 0.0, 0.0, 0.0........}

        // for string
        String [] st = new String[3]; // {null, null, null}
        char [] ch = new char[4]; // { , , , }

        System.out.println("Default value is : " + ch);
    }
}
