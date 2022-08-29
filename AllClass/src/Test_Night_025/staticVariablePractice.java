package Test_Night_025;

import MyLibrary.Library;

public class staticVariablePractice {

    //local variable : declared inside of block
    //instance variable :declared outside the blocks
            //instance variable can have multiple copy from object
            //they need to be called through object
    //static variables :declared outside any block with static keyword
            //static variable can only have one copy from object
            //they can also be called with classname itself
    int instanceVer;
    static int staticVer;

    public static void main(String[] args) {

        int localVer;

        // instanceVer needs to be called through object

        staticVariablePractice object1 = new staticVariablePractice();
        object1.instanceVer = 20;
        object1.staticVer = 10;

        staticVariablePractice object2 = new staticVariablePractice();
        // instance variable can have multiple copy from object
        System.out.println(object1.instanceVer); // 20
        System.out.println(object2.instanceVer); // 0

        Library.stars();


        // Static veriable can onl have one copy from object
        System.out.println(object1.staticVer); // 10
        System.out.println(object2.staticVer); // 10

        // they can also be called with classname itself
        System.out.println(staticVariablePractice.staticVer);

        // instance variable
        // they need to be called through object
        // System.out.println(staticVariablePractice.instanceVer);
    }

}
