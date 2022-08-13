package Test_Night_022;

public class c4_ParseMethod {

    public static void main(String[] args) {

        // methods:
        //          parse method : converts string of text to the primitive, return primitive values
        //          "123"

        //          valueOf methods : converting string to wrapper class value, return wrapper class values

        String str = "123";
       // int i1 = str; error

        System.out.println(str+20); // 12320 // string text

        int i2 = Integer.parseInt(str);
        //      parse int method will take str string and return primitive int number

        System.out.println(i2+20); // 143 // int number


        String str2 = "10.55";

        float f1 = Float.parseFloat(str2);

        System.out.println(f1 + 2);

        double d1 = Double.parseDouble(str2);
        System.out.println(d1+5);

        String str3 = "True";
        String str4 = "False";
        String str5 = "TruE";
        String str6 = "FalSE";
        String str7 = "truehello";

        boolean bool1 = Boolean.parseBoolean(str3); // true
        boolean bool2 = Boolean.parseBoolean(str4); // false
        boolean bool3 = Boolean.parseBoolean(str5); // true
        boolean bool4 = Boolean.parseBoolean(str6); // false
        boolean bool5 = Boolean.parseBoolean(str7); // anything is not equal to false or true will be false

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);
        System.out.println(bool5);




    }
}
