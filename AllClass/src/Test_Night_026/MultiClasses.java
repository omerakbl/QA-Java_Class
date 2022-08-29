package Test_Night_026;


// in Java you can only have one public class

import Test_Night_025.Animals;

public class MultiClasses {
    public static void main(String[] args) {
        System.out.println("Main Class");
    }

}

class Dog{
    public static void main(String[] args) {
        System.out.println("Dog");
    }

}
class Cat{
    public static void main(String[] args) {
        System.out.println("Cat");
    }
    public static void helloCat(){
        System.out.println("HelloCat");
    }

    public void helloCat2(){
        System.out.println("hello act 2");
    }

}
class Bird{
    public static void main(String[] args) {
        System.out.println("Bird");
        Animals a1 = new Animals();
        Cat.helloCat();

        Cat c1 = new Cat();
        c1.helloCat2();

    }
}
