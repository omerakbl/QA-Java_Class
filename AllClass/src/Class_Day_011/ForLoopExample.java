package Class_Day_011;

public class ForLoopExample {
    public static void main(String[] args) {

        // Write a code where the code print even numbers between zero to 100;(100 included)

        int count = 0;
        for (int i = 0; i<=100; i++){ // 1,2,3,4,5,6,7,8,9,10, ........... 100,101

            if (i%2 == 0){ // check if number can be divided by 2

                System.out.println(i);
                count++;
            }
            System.out.println(count);

            int count2 = 0;
            for (int x = 0; x<=100; x+=2){
                System.out.println(x);
                count2++;
            }

            System.out.println(count2);

        }


    }
}
