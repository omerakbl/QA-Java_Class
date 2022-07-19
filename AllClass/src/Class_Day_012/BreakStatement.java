package Class_Day_012;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i=0; i<=10; i++){

            //start point inc
            System.out.println("Hello Hello");
            if (i==5){
                System.out.println("Hello World");
            }

        }
        System.out.println("**********************");

        //Break Statement

        // anytime java will reach to break statement it will stop current condition


        for (int i=0; i<=10; i++){
            System.out.println("Hello");
            System.out.println(i);

            if (i==5){
                break;
            }
        }

        for (int i=0; i<300; i++){
            System.out.println("Speed" + i);

            if (i==75){
                break;
            }
        }

        // for loop shortcut : fori

        for (int i = 0; i < 300; i++) {
            System.out.println("Speed " + i);

            if (i==75){
                break;

            }
        }

        for (int i = 1; i <9; i++) {
            // i=1
            System.out.println(i);

            if (i%2 == 0 && i%3==0){
                break;
            }
        }

        for (int x = 0; x < 10; x+=2) {
            System.out.println(x
            );
        }

        System.out.println("********************");

        int sum =0;

        for (int i = 0; i <=50; i++) {
            sum+=i;
            //System.out.println("FIRST" + sum);
            if (sum>=153){
                break;
            }
            System.out.println("Sec nd" + sum);

        }
        //System.out.println(sum);

    }
}
