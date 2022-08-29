package Test_Night_026;

import MyLibrary.Library;

public class CarObject {

    public static void main(String[] args) {
        // Car car1 = new Car();
        // car1 object using default constructor from Car class
        // if you dont create any constructor java will create a default constructor for your class
        Car car2 = new Car("Merco",2022,25.23423,"Mate");
        System.out.println(car2.brand);
        System.out.println(car2.year);
        System.out.println(car2.price);
        System.out.println(car2.color);

        Car car3 = new Car("Ford",2016,14.500,"White");

        System.out.println(car3);
        Library.stars();
        car3.getCarBrandYear();
    }
}
