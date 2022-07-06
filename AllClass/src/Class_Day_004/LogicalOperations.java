package Class_Day_004;

public class LogicalOperations {
    public static void main(String[] args) {

        // && -- and
        // || -- or
        // ! -- not (Opposite)

        boolean balls = (12>7) && (3<8) && (9==7);
        System.out.println(balls);


        // If you are using operator only if your all conditions are true you will see result as true
        // other then that always false
        // true && false = false


        boolean flowers = (true) && (3<=8) && (8!=9);
        System.out.println(flowers);


        // || -- or

        System.out.println( (9>11) || (6<9) );

        // ! -- NOT

        boolean cars = !("red" == "blue");
        System.out.println(cars);

        boolean q = !(((4==5) || (7<9)) && ((8<=10) || (true)) );
        System.out.println(q);




    }
}
