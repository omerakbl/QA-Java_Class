package Homework_05;



public class Homework_02 {
    public static void main(String[] args) {

        int input = 30;

        for (int i = 1; i <= input; i++) {

            if (i % 3 == 0 && i % 5 == 0 )
            {
                System.out.println("FINRA");

            }
            else if (i % 3 == 0)
            {
                System.out.println("FIN");

            }else if (i % 5 == 0){
                System.out.println("RA");
            }else {
                System.out.println(i);
            }

        }

    }
}
