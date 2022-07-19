package Class_Day_012;

public class ContinueStatement {
    public static void main(String[] args) {

        // If you run your code and if its contains continue it will pass that iteration int for loop


        // I want to peint all the numbers between 0 to 10 (not included) except number 3,6 and 9
        for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9,10

            if (i == 3 || i == 6 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
