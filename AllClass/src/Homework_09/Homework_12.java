package Homework_09;

import java.util.Arrays;

public class Homework_12 {
    public static void main(String[] args) {

        /*
        Write   a   Java   program   to   reverse   the   element   of   an   integer    array.
        */

        int [] nums = {1,2,3,4,5,6,7,8,9,0};

        int [] reverse = new int[nums.length];

        int x = 0;
        for (int i = nums.length-1; i >= 0 ; i--) {

            reverse[x] = nums[i];
            x++;

        }

        System.out.println(Arrays.toString(reverse));



    }
}
