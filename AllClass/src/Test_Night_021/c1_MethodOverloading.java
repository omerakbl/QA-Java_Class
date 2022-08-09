package Test_Night_021;

public class c1_MethodOverloading {

    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 10.5;
        byte num3 = 2;

        method(num1);
        method(num2);
        method(num3);
        method("Hello");
    }


    // Method overloading is creating everything same for method
    // Only parameters type will be different
    // ex : same // access-modifier             specifier               return type             methodName
    // (parameter) needs to be different

    public static void method( int a){
        System.out.println(a + " is int");

    }

    public static void method(double a){
        System.out.println(a + " is double");
    }

    public static void method(byte a){
        System.out.println(a + " is byte");
    }

    public static void method(String a){
        System.out.println(a + " is String");
    }
}
