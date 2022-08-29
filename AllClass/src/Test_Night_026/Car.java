package Test_Night_026;

public class Car {

    // if you don't create any Constructor Java will have default constructor
   String brand;
   int year;
   double price;
   String color;

   public Car(String brand, int year,double price, String color){

       this.brand=brand;
       this.year=year;
       this.price=price;
       this.color=color;

   }
   public String toString(){

       return year + " , " + brand + " , " + price + " , " + color;
   }
   public void getCarBrandYear(){
       System.out.println("Brand is : " + brand);
       System.out.println("Year is : " + year);
   }

    // access modifiers
    // oop : object-oriented programing
}
