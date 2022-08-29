package Test_Night_029;

class test2 {
    public test2(String str) {
        System.out.println("Test2");

    }
    public test2(int a){
        System.out.println("Test2 int");
    }
}


public class c4_ConstructorSuper extends test2{

    public c4_ConstructorSuper(){
        //super(); java will always try to get parent default constructor if you have extended
        // if there is no default it will give error
        // you need use super keyword to navigate super class of constructor
        super("");
        System.out.println("c4_cons");

    }
    public static void main(String[] args) {

        test2 obj = new test2("Hello"); // test2

        c4_ConstructorSuper obj2 = new c4_ConstructorSuper(); // test2 c4_cons



    }
}
