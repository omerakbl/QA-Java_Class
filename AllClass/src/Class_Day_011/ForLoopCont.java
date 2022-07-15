package Class_Day_011;

public class ForLoopCont {
    public static void main(String[] args) {
        // for (startpoint; endpoint; interation){

        // Code block that will be ran

        // } this is how we declare For loop

        // Write a for loop that increase by 2 for each iteration
        int count = 0;
        for ( int i = 1; i<100; i+= 2){ // 1, 3, 5, .........
            System.out.println("The value of i : " + i);

        }


        // write a code that counts the iterations

        for (int i = 1; i<100; i+= 2){
            System.out.println("The value of i : " + i); // i value 1,3,5, ....... 99
            count++; // 1,2,3,4,5,6,7,8, ......... 50
        }

        System.out.println(count);

    }
}
