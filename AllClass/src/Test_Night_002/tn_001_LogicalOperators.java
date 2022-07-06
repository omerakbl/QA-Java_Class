package Test_Night_002;

public class tn_001_LogicalOperators {
    public static void main(String[] args) {

        // && -- and
        // || -- or
        // ! -- not (Opposite)

        System.out.println( (5>3) && (3>5) );   // (true && false) - False
        System.out.println( (10>1) && (20>5) ); // (true && true) - True
        System.out.println( ( 2==3) && (3==3) );// (false && true) - False
        System.out.println( (2!=2) && (3>10) ); // (false && false) -False

        // If you are using operator only if your all conditions are true you will see result as true
        // other then that always false
        // true && false = false

        System.out.println("*************");

        // || -- or
        System.out.println( (5>3) || (3>5) );   // (true || false) - True
        System.out.println( (10>1) || (20>5) ); // (true || true) - True
        System.out.println( ( 2==3) || (3==3) );// (false || true) - True
        System.out.println( (2!=2) || (3>10) ); // (false || false) -False

        // ! -- Not (Opposite)

        boolean bool1 = true;
        boolean bool2 = ! ( 10 != 15); // !true == false

        System.out.println("*************");

        System.out.println(bool1 && bool2);

        boolean bool3 = !!!!!!bool1; // !!!!!! true
        // !!!!! false
        // !!!! true
        // true
        boolean bool4 = !(10 >= 10); // ! (true) == false

        System.out.println("*************");

        System.out.println( (bool3 || bool4) && true );
        // ( (true || false ) && true )  (true || false ) == true
        // ( true && true )
        // true

        System.out.println("*************");

        System.out.println(("omer"  == "lucas") || ( "lucas" == "Lucas"));
        // java case senstive language to be able to say 2 string is equal case need to match
        // anything inside of string will be a letter and those also has to match ( space, numbers, #$%)

        System.out.println(("omer"  == "lucas") || ( "lucas" == "lucas "));






    }
}
