package Test_Night_027;

public class AccessModifiersTest {

    public static void main(String[] args) {

        AccessModifiers object1 = new AccessModifiers();

        System.out.println(object1.publicVariable); // 30
        System.out.println(object1.defaultVer); // 20
        //System.out.println(object1.privateVariable); private will be only accessible from same class


    }
}
