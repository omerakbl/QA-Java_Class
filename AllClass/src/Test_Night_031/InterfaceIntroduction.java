package Test_Night_031;

public interface InterfaceIntroduction {
    //            there is only one access modifier allowed in interface ==> public
    // you can implement inheritence in the interfaces by using implements keyword (instead of extand)
    // you can implement multiple interfaces

    //differences between abstract class and interface
    //A class can inherit from one class only (extends)
    //A class can inherit multiple interfaces (implements)

    //what we can have in interface?
    //variable: static & final by default
    //methods: abstract methods, static methods, default method

//    what we cannot have in interface?
//    constructor
//    instance variable
//    instance methods
//    blocks

    //void method1(){}; this method can only be abstract methods, static methods, default method
    default void method1(){};
    static void method2(){};
    public abstract void method3();//public and abstract
    abstract void method4();//public and abstract
    void method5(); //public and abstract
}
