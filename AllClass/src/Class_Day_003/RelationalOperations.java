package Class_Day_003;

public class RelationalOperations {
    public static void main(String[] args) {

        //1st logical expression
        // == the options are either true or false

        boolean b1 = 10 == 10;
        System.out.println(b1);

        boolean b2 = ">" == ">";
        System.out.println(b2);
        System.out.println("******************");
        //2nd >= checks 2 thing and if it is greater or equal it will return true

        boolean b3 = 12 >= 10;
        System.out.println(b3);

        boolean b4 = 12 >= 200;
        System.out.println(b4);
        System.out.println("******************");

        //3th check 2 things and if it less or equal it returns as true, otherwise it is false

        boolean b5 = 14 <= 15;
        System.out.println(b5);

        boolean b6 = 17 <= 16;
        System.out.println(b6);
        System.out.println("******************");

        //4th != compares 2 thing if they are NOT equal it will return true, otherwise it will be false

        boolean b7 = 14 != 14;

        boolean b8 = 27 != 23; // true
        System.out.println(b8);
        System.out.println("******************");

        //5th > compares 2 things if one is greter than the other it will be true, otherwise it will be false

        boolean b9 = 14 > 15; //false
        boolean b10 = 30 > 20;
        System.out.println(b9);
        System.out.println(b10);

        //6th < compares 2 things if one is greter than the other it will be true, otherwise it will be false

        boolean b11 = 11 < 900;
        boolean b12 = 900 < 100;
        System.out.println(b11);
        System.out.println(b12);
        System.out.println("******************");



        boolean b14 = !((true == false) == !(10<=11));
        System.out.println(b14);

        boolean b15 = !(("C" == "c") == (13 == 14) == !(("a" == "A") == (true==true)));
        System.out.println(b15);



    }
}
