package Class_Day_006;

public class Multiple_Ternary {
    public static void main(String[] args) {

        // number is 0 just say 0
        // if is even just say even
        // or if it is odd say it odd

        int x = 50;

        String result;

        result = (x % 2 ==0)?  "Even" : (x == 0 )?  "Zero" : "Odd";
        System.out.println("Result = " + result);







    }
}
