package Test_Night_002;

public class tn_003_ifStatement {

    public static void main(String[] args) {

        boolean bool1 = 10 > 5; // true
        boolean bool2 = false;

        if (bool1) {
            System.out.println("if condition true print me");
            System.out.println("Ola!");

        }

        if (bool2){ // since this condition is false java wont check inside of this if

            System.out.println("if condition true print me 2");
            System.out.println("Ola! 2");
        }

        System.out.println("Ola! 3");

        if ( 2==2 ){ // true condition

            System.out.println(4);
        }

        if ( 2!=2 ) { // false condition then java wont check inside of your if statement

            System.out.println(5);
        }


    }
}
