package Class_Day_014;

public class WhileNastedLoop {
    public static void main(String[] args) {
        int i = 0;

        while (i<2){
            //i++;
            System.out.println("From the outer loop i value: " + i);

            int j = 0;

            while (j<2){
                System.out.println("     From the inner loop j  value: " + j);
                j++;
                int sum = j+i;

            }
            i++;
        }

        System.out.println("***************************************");

        int k = 0;
        while (k<3){
            System.out.println("From the while loop, Outer Loop the k value: "+ k);

            for (int l = 0; l < 3; l++) {


                System.out.println("From inner For Loop l value: "+ l);
            }
            k++;
        }
    }
}
