package Test_Night_029;

public class c2_AccessTest {

    public static void main(String[] args) {
        // since veriables and method that we created are static
        // I will be able to call them with class name

        System.out.println("c1_AccessModifier.publicVrb = " + c1_AccessModifier.publicVrb);
        System.out.println("c1_AccessModifier.defaultVrb = " + c1_AccessModifier.defaultVrb);
        System.out.println("c1_AccessModifier.protectedVrb = " + c1_AccessModifier.protectedVrb);
        // I don't have access to private variable

        c1_AccessModifier.defaultMethod();
        c1_AccessModifier.PublicMethod();
        c1_AccessModifier.protectedMethod();

        // can't call private
    }
}
