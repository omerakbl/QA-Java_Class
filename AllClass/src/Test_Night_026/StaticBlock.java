package Test_Night_026;

public class StaticBlock {

    int instanceVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) {
        int localVar = 30;
        System.out.println("This is main method");

        methodStatic();
        System.out.println("Hello");

        StaticBlock sb = new StaticBlock(); // this object will run instance block

        sb.methodInstance();

        StaticBlock sb2 = new StaticBlock();

    }

    static {
        // this is a static block
        System.out.println("This is static block");

        // no matter what always static block will be executed before anything
    }

    {
        // this is instance block
        System.out.println("This is instance block");
    }

    public static void methodStatic(){
        System.out.println("This is static method");

    }

    public void methodInstance(){

        System.out.println("This is instance method");

    }


}
