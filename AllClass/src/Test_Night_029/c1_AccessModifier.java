package Test_Night_029;

public class c1_AccessModifier {

    //			Access modifiers: public, protected, default, private
    //Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.

    //Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.

    //Protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.

    //Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.


    public  static String publicVrb;
    private static String privateVrb;
    static String defaultVrb;
    protected static String protectedVrb;

    public static void PublicMethod(){
        System.out.println("Public Method");

    }
    static void defaultMethod(){
        System.out.println("Default Method");

    }
    private void privateMethod(){
        System.out.println("Private Method");

    }
    protected static void protectedMethod(){
        System.out.println("Protected Method");

    }
}
