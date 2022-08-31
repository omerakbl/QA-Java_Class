package Test_Night_031;

abstract class class1{
    public abstract void method1(); // this is abstract method and its meant to be override
    public void method2(){ // we can also have non-abstract methods inside abstract class
        System.out.println("method2");
    }
}
public class AbstractPractice extends class1 {
    // you inherited method1 and method2
    //since method 1 was abstract that needs be override
    @Override
    public void method1() {
        System.out.println("method 1 in AbstractPractice");
    }
}

abstract class class2 extends class1{
    // you inherited method1 and method2
    //since class2 also absstract it will be optional to override method1

    abstract void method3();
}

class class3 extends class2{
    @Override
    public void method1() {
        System.out.println("method1 in class 3");
    }

    @Override
    void method3() {
        System.out.println("method 3 in class 3");

    }
    // you inherited method1 and method2 that has been inherited in class2
    // you also inherited method3 from class2
}

    //parent
    //middle sub class
    //subclass

