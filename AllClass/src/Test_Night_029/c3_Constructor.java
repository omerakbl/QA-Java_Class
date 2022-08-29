package Test_Night_029;

class test{
    // constructor of test
    public test(){
        System.out.println("Test");
    }

}

public class c3_Constructor extends test {
    // since we extend test class
    // everything inside test will be inherited
    // public test()  inherited



    public c3_Constructor(){
        System.out.println("Hello");
    }
    public c3_Constructor(String str){
        this();
        System.out.println("Hello String");
    }

    public static void main(String[] args) {
        test obj = new test();

        c3_Constructor obj2 = new c3_Constructor(); // test and hello will be printed
        // since c3 class take test as parent
        // constructor of test will be inherited



    /*
    Within same class: It can be done using this() keyword for constructors in same class
    From base class: by using super() keyword to call constructor from the base class.-- we will see this later

    Why do we need constructor chaining ?
    This process is used when we want to perform multiple tasks in a single constructor
    rather than creating a code for each task in a single constructor we create a separate constructor for each task
    and make their chain which makes the program more readable.
     */
    }
}
