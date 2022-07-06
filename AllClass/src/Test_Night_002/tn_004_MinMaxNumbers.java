package Test_Night_002;

public class tn_004_MinMaxNumbers {

    public static void main (String [] args ){

        // x y z
        // min number
        // create a logic that will going to print minimum number between 3 numbers

        int x = 245;
        int y = -500;
        int z = 0;

        boolean xMin = x < y  &&  x < z;  // false && false == false
        // x has to smaller then y and smaller then z

        boolean yMin = y < x && y < z;  // true && true == true
        // if y is minimum  number then y has to be smaler then x and z

        boolean zMin = z < x && z < y; // true && false == false
        // if z is minimum  number then z has to be smaler then x and y

        if (xMin){ // false
            System.out.println(x + " is the minimum number between ------ \t" + x + " , " + y + " , " + z);
        }
        if (yMin) { //true
            System.out.println(y + " is the minimum number ------ \t" + x + " , " + y + " , " + z);
        }
        if (zMin) { //false
            System.out.println(z + " is the minimum number ------ \t" + x + " , " + y + " , " + z);
        }

        System.out.println("\n ****************************** \n");

        int i = 1999;
        int k = -2000;
        int m = 20;

        boolean iMax = i > k && i > m; //True
        boolean kMax = k > i && k > m; //false
        boolean mMax = m > i && m > k; // false

        if (iMax){ // false
            System.out.println(i + " is the maximum number between ------ " + i + " , " + k + " , " + m);
        }
        if (kMax) { //true
            System.out.println(k + " is the maximum number between ------ " + i + " , " + k + " , " + m);
        }
        if (mMax) { //false
            System.out.println(m + " is the maximum number between ------ " + i + " , " + k + " , " + m);
        }



    }
}
