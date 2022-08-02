package Class_Day_014;

public class BreakandContStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            System.out.println("From the outer loo[ i value: "  + i);
            for (int j = 0; j < 3; j++) {
                if (j==2){
                    break;
                }
                System.out.println("       From the inner loop j value: "+ j);
            }
        }

        System.out.println("**************************");

        for (int i = 0; i < 3; i++) {

            System.out.println("From the outer loo[ i value: "  + i);
            for (int j = 0; j < 4; j++) {
                if (j==2){
                    continue;
                }
                System.out.println("       From the inner loop j value: "+ j);
            }
        }




    }
}
