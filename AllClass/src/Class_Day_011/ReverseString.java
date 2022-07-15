package Class_Day_011;

public class ReverseString {
    public static void main(String[] args) {
        // String are indexed
        // the first char in a string has index of 0
        // the last char in a string has index of length-1

        String Lucas = "Hello";
        //Lucas.charAt(0);

        System.out.println(Lucas.charAt(0));
        System.out.println(Lucas.charAt(Lucas.length()-1));
        System.out.println(Lucas.charAt(Lucas.length()-2));

        String Reverse = "";

        for (int x = Lucas.length()-1; x >= 0; x--){ // it will start from the last index (4)
            Reverse = Reverse + Lucas.charAt(x);

        }

        System.out.println(Reverse);



    }
}
