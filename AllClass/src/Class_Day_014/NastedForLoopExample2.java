package Class_Day_014;

public class NastedForLoopExample2 {
    public static void main(String[] args) {
        for (int k = 7; k >= 0; k--) {

            for (int x = 0; x <= k; x++) {
                System.out.print(x + " "); //

            }
            System.out.println();
        }


        for (int i = 0; i <= 7; i++) { // this loop will run 7 times

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " "); // will run 21 times

            }
            System.out.println();
        }



    }
}
