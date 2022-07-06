package Test_Night_002;

public class tn_002_remaningOperators {

    public static void main(String[] args) {

        //

        int x = 100;
        System.out.println(x);

        System.out.println("*************");

        x +=50; // x = x + 50
        System.out.println(x);

        System.out.println("*************");

        int y = 100;
        y = y + 50;
        System.out.println(y);

        System.out.println("*************");

        x = -y;
        System.out.println(x);

        //-150
        // -150 -50 == -200
        x -= 50;
        System.out.println(x);

        // -= or += means add or remove up to given number

        System.out.println("*************");

        int z = 10;
        // x = -200
        z = x + 50 - x; // z = (200) + 50 (-200)
        // z = -150 + (+200)
        // z = -150 + 200
        // z = 50
        System.out.println(z);

        z -= z + z -z + 50; // z = z - (z+z-z+50)
        // z= 50
        // 50- (z+z-z+50) == 50 -(50+50-50+50)
        System.out.println(z);

        System.out.println("*************");

        int i=100;
        System.out.println(i); // i= 100

        i = 150; // assign 150 to i
        System.out.println(i); // i= 150

        i -= 50; // i = i - 50 // 100
        System.out.println(i); //100

        System.out.println("*************");

        int number = 5;
        number *= 4; // number = number * 4 -- number = 5 * 4

        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number = number / 2; // number /= 2; are same

        System.out.println(number);





    }

}
