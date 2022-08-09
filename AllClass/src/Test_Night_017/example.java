package Test_Night_017;

public class example {

    // Write a java program that will check array from front and back
    // If its same print true if its not same print false


    // int [] numbers = {0,1,2,2,1,0};
    // front 0,1,2,2,1,0
    // back 0,1,2,2,1,0
    // output will be true
    public static void main(String[] args) {
        int [] numbers = {0,1,2,2,1,0};

        // total length is 6
        // in this case to achieve got same result from front and back we need compare index numbers
        // front read = back read
        // numbers [0] == numbers[5]
        // numbers [1] == numbers[4]
        // numbers [2] == numbers[3]
        // numbers [3] == numbers[2]
        // numbers [4] == numbers[1]
        // numbers [5] == numbers[0]

        // first is always 0
        // last index is always length -1
        // if (numbers[0]==numbers[numbers.length-1]){
        // System.out.println("true");
        // }

        boolean  b1 = true;


        int x = 0;

        for (int i = numbers.length-1; i >= 0 ; i--) {
           if (numbers[i] != numbers[x]){
               b1 = false;
               break;
           }else {
               x++;
           }
        }

        System.out.println(b1);
    }
}
