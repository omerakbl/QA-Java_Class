package Test_Night_001;

public class tn_002_UranyOperators {

    public static void main(String[] args) {

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
