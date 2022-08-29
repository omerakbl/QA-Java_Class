package Test_Night_028;

public class Bird extends Animal{

    /*

    Since we extend animal class we will have acces to all below
    name
    age
    weight

    eat()
    move()
    grow()
     */

    public void fly(){
        System.out.println(name + " is flying");
    }

    public static void main(String[] args) {

        Bird bird1 = new Bird();

        bird1.name = "cikcik";

        bird1.age = 4;
        System.out.println(bird1.age + " " + bird1.name);

        bird1.move();

        bird1.eat("Lettuce");

        bird1.fly();
    }


}
