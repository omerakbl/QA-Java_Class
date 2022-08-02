package Class_Day_016;

public class ArraysContinue {
    public static void main(String[] args) {

        // Find the average ages of people in array

        int [] ages = {24,60,23,19,45,90}; // sum of all the numbers // number of the ages

        int sum = 0;

        for (int i = 0; i < ages.length; i++)
        {
            sum += ages[i]; // sum = sum + ages[i];

        }

        float avr = (float)  sum/ages.length;
        System.out.println( "The average age is : " + avr);



    }
}
