package MyLibrary;

import Test_Night_027.AccessModifiers;
import Test_Night_027.FemalePerson;

public class AccessModifiersLibrary {

    public static void main(String[] args) {
        AccessModifiers object1 = new AccessModifiers();

        System.out.println();//from everywhere
        // System.out.println(obj1.defaultVrble);//default needs be same package
        // System.out.println(obj1.privateVariable);//priavaete needs to be same class


        FemalePerson person1=new FemalePerson();
        person1.name="heshu";
        //System.out.println("FemalePerson.isHuman = " + FemalePerson.isHuman);
        //person1.age=25; age is default variable
        //default variables doesn't have access for outside of package
    }
}
