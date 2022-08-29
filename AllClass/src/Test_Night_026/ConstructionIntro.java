package Test_Night_026;

public class ConstructionIntro {
    //constructor needs to have same name that class  has

//    public ConstructorIntro(){
//        //this will be created automatically if you don't create
//        //constructor helps class to create an object
//        System.out.println("default constructor");
//    }

    //can we overload constructor methods
    //yes

    public ConstructionIntro(){
//        this will be created automatically if you dont create
//        constructor helps class to create an object
//        System.out.println("default constrctor");

        System.out.println("Default Constructor");

    }
    public ConstructionIntro(int a){

        System.out.println("Constructor with the arguments of int " + a);

   }

    public static void main(String[] args) {
        // ConstructionIntro object1 = new ConstructionIntro();
        // objects needs to be created with existing Constructor method

        ConstructionIntro object2 = new ConstructionIntro(10);

    }
}
