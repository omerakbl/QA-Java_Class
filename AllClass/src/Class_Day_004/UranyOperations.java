package Class_Day_004;

public class UranyOperations {
    public static void main(String[] args) {

        //Unary Plus (+) It does not have any effect on the number;

        int number = 10;
        number = + number;
        System.out.println(number);

        int number1 = -10;
        number1 = +number1;
        System.out.println(number1);

        System.out.println("******************");

        // Unary Minus (-) // It will change the sign or the value to be opposite

        int number2 = -20;
        number2 = -number2;
        System.out.println(number2);

        int number3 = 30;
        number3 = -number3;
        System.out.println(number3);

        System.out.println("******************");

        // Increasement Operator (++) / It increase the number by 1

        int number4 = 8;
        number4++; // number4 = number4 + 1;
        System.out.println(number4);

        System.out.println("******************");

        // Decreasement Operator (--) / It decrease the number by 1

        int number5  = 30;
        number5--; // number5 = number5 -1;
        System.out.println(number5);

        System.out.println("******************");

        // Invert (!) It inverts boolean values. if it is true it will be False
        // If it is false it will be True

        boolean bool = true;
        bool = !bool;
        System.out.println(bool);



        //create veriables
        byte b1 = 5;
        byte b2 = b1; // 5
        int b3 = - b1; // -5
        int b4 = + b3; // + -5 = -5
        int b5 = - b3; // - -5 = +5

        System.out.println(b1); // 5
        System.out.println(b2); // b2 = b1 = 5
        System.out.println(b3); // b3 = - b1 = -5
        System.out.println(b4); // = + - 5 = -5
        System.out.println(b5); // - - 5 = 5

        int x = 10;
        int y = - x; // -10

        boolean bool1= y > 0; // false -10
        boolean bool2= x <= 0; // false 10

        System.out.println(bool1);
        System.out.println(bool2);

    }
}
