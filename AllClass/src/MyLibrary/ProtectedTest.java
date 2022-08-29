package MyLibrary;
import Test_Night_029.c1_AccessModifier;

public class ProtectedTest extends c1_AccessModifier{



    public static void main(String[] args) {
        System.out.println("c1_AccessModifier.publicVrb = " + c1_AccessModifier.publicVrb);
        System.out.println("c1_AccessModifier.protectedVrb = " + c1_AccessModifier.protectedVrb);

        c1_AccessModifier.PublicMethod();
        c1_AccessModifier.protectedMethod();

        // cant call default or private
    }
}
