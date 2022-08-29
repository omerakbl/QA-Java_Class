package Test_Night_025;

public class Car {

    String brand; // instance varible
    String model;
    static boolean hasEngine=true; //static variable

//if you are not going to create an multiple copy from object use static variable
    //such as folderpats,enviromentname,url

    //other then that which you will create a multiple copy from object use instance variables

    public void printBrand(String brand){
        System.out.println(this.brand=brand );
        //now either we need to create an object or make the method instance
    }

    public static void main(String[] args) {
        System.out.println(hasEngine);

        Car        car1 =new Car();
        //class ref name=object
        //object name car1
        //class name =car
        //how did we create object?
        //we created from class

        car1.printBrand("bmw");

    }
}
