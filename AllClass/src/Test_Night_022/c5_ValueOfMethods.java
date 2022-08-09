package Test_Night_022;

public class c5_ValueOfMethods {

    public static void main(String[] args) {

        String str = "25";

        int number = Integer.parseInt(str);
        Integer number2 = Integer.valueOf(str);

        System.out.println(str+25);          // 2525 String text
        System.out.println(number2 + 25);    // 50 Integer number

        String str2 = "55.5";
        Double d1 = Double.valueOf(str2);

        System.out.println(d1 + 5); // 60.5

        double d2 = Double.valueOf(str2); // unboxing
        // Double.valueOf(str2); this return wrapper class
        // we also took this wrapper class and assign to primitive which is unboxing

        String str3 = "True";
        Boolean bool1 = Boolean.valueOf(str3);

        System.out.println(bool1); // true
    }
}
