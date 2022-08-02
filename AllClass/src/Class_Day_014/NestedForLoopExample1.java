package Class_Day_014;

public class NestedForLoopExample1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("First Loop : " + i); // 5 times
            for (int j = 1; j <= 5; j++) {
                System.out.println("     First Inner For Loop : " + j); // 25 times
                for (int k = 1; k <= 5; k++) {
                    System.out.println("          Second Inner Loop : " + k); // 125 times

                }

            }

        }
    }
}
