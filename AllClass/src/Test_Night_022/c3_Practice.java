package Test_Night_022;

public class c3_Practice {
    public static void main(String[] args) {

        int number = 120; // primitive

        Integer int1 = number; // autoboxing // Primitive to assign wrapper //  wrapper object
        Byte b1 = 25; //  Wrapper Object

        byte b2 = b1; // primitive       // Wrapper to assign primitive unboxing   // 25
        int i10 = b1; // primitive       // Wrapper to assign primitive unboxing   // 25

        boolean b33= i10 == b1;          // Wrapper to assign primitive unboxing
        // equal operator will only check the value

        Boolean bool = b33;            //wrapper            autoboxing       // Primitive to assign wrapper
        Boolean bool1 = i10 == b1;     //wrapper                             // Primitive to assign wrapper

        System.out.println(b33);
        System.out.println(bool);
        System.out.println(bool1);

        System.out.println(b1.equals(i10)); // false
        // b1 Wrapper class = 25
        // int primitive = 25
        // equal method will check where the object comming from

    }
}
