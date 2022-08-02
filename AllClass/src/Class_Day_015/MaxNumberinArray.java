package Class_Day_015;

public class MaxNumberinArray {
    public static void main(String[] args) {

        int [] miracle = {5,98,3,56,23,7}; // { -1, -5, -6, -2 }

        int max = miracle[0]; // Assigning the first value in array to the max value.

        for (int i = 0; i < miracle.length; i++) {

            if (max< miracle[i]) // check if the index i value in array is greater than the current value of max;
            {
                max = miracle[i];
            }



        }
        System.out.println("The max value in the array is : " + max);
    }
}
