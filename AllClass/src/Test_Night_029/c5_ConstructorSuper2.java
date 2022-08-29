package Test_Night_029;

class test3{
    int number = 100;

    public test3(int i1){
        System.out.println("i1 : " + i1);
        System.out.println(this.number);
    }
}

public class c5_ConstructorSuper2 extends test3{

    int number = 50;
    public c5_ConstructorSuper2(){
        super(20);
        System.out.println(super.number); // super will call your super class instance variable -- 100
        System.out.println(this.number); // this will call your current class instance variable -- 50
    }

    // super() calls super class constructor method
    // super. keyword will call super class variable

    public static void main(String[] args) {
        c5_ConstructorSuper2 obj =new c5_ConstructorSuper2();
    }
}
