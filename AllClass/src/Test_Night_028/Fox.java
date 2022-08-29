package Test_Night_028;

public class Fox extends Animal {

    public static void main(String[] args) {
        Fox fox1 = new Fox();
        //fox1.eat("meat"); // so if we don't extend parent class we cannot call any function from parent

        fox1.name="wikwik";
        fox1.age=5;
        fox1.weight=10.5;

        fox1.eat("chicken");

        fox1.move();
        fox1.grow();

    }
}
