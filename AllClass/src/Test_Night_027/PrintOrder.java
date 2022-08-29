package Test_Night_027;

public class PrintOrder {

    public PrintOrder(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        PrintOrder object1 = new PrintOrder(); // this will run your constructor and instance block
        System.out.println("Hello Main");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    public static void methodStatic(){
        System.out.println("Static Method");
    }

    public void methodInstance(){
        System.out.println("Instance Method");
    }

    // no matter what if you run your class static method will run before everything
    // then main method will run
    // depend on what you have in main method they will be getting printed in line order

    //new object will run instance block and constructor together
    //        printOrder obj1=new printOrder();//this will run your constructor and instance block
    //first instance block will get executed
}
