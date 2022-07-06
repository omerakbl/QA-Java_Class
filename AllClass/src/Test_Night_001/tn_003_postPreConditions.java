package Test_Night_001;

public class tn_003_postPreConditions {


    public static void main(String[] args) {

        // pre : this will change the value of number immediatly
        //post : first wont gonna change anything on the variable , at the end it will change it

        int x = 10;
        System.out.println(x); // 10
        System.out.println(++x); // pre condition will increase the number 11
        System.out.println(x); // 11
        System.out.println(++x); // 12

        System.out.println(+x); // this wont change number value it is effecting either postitive or negative

        System.out.print(" **************************** \n ");


        int y = 20;

        System.out.println( y ); // 20
        System.out.println( --y ); // pre condition will decrease the number 19

        System.out.print(" **************************** \n ");

        //post condition

        int z = 10;
        System.out.println(z++); // post will increase the number on next steps not immediatly
        System.out.println(z);

        int w = 20;
        System.out.println( w-- ); // post will decrease the number on next steps not immediatly // 20 on next 19
        System.out.println( w ); // it will be still 19 on next line will be 18

        System.out.print(" **************************** \n ");


        int i1 = 15;
        System.out.println( -- i1 ); // pre condition decrease immediatly // 14
        System.out.println( i1++ ); // post condition this line wont be effected because it will increase on next line i1=15
        System.out.println( i1 ); // no post - pre condition this line 15 next line 15
        System.out.println( ++ i1 ); // pre condition it will increase 15 to 16 immediatly
    }
}
