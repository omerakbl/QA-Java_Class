package Test_Night_001;

public class tn_004_PrimitiveCasting {
    public static void main(String[] args) {
        // we have 2 type of primitive casting
            // 1 - implicit casting ( done automaticly from java)
            // 2 - explicit casting (needs to be handle manually)

       //double > float > long > int > short > byte
        byte b1 = 20;
        long l1 = b1; // this is implicit casting ( done automaticly by java ) simce long is bigger then byte

        System.out.println("**************************");

        int i1 = 127;
        byte b2 = (byte)  i1; //casting done by programmer manually // explicit casting

        // -128 - 127

        System.out.println("**************************");

        double d1 = 2.3;
        float f1 = (float)  d1; //casting done by programmer manually // explicit casting

        System.out.println("**************************");

        int i2 = 200;
        long l2 = i1; // implicit casting
        short s1 = (short) l2; // explicit casting
        byte b3 = (byte) s1; // explicit casting

    }
}
