package Test_Night_001;

public class Practice {
    public static void main(String[] args) {

        //Create 3 different number
        //Second number should be = first number + 7
        //third number should be = secon number + 8
        //ex : x=25 , y=32 , z=40
        //ex : x 20 , y=27 , z=35

        int x=25;

        //y=32
        // x= 25 + 7 = 32 //// y=25+7
        int y=x+7; // 25 + 7 = 32

        //z=40
        int z = y+8; // (x=25) + 8 = 24 + 7 + 8 = 40


        System.out.println("X is  :" + x);
        System.out.println("y is :" + y);
        System.out.println("z is :" + z);

        //sum of three number
        //text + number = text
        System.out.println("sum of x,y,z is :" + x+y+z);


        //sum of x,y,z is : + (25+32+40) = (97)
        System.out.println("sum of x,y,z is :" + (x+y+z));



        //if the x is divisble by 2 , 3 , 5
        /* Check if 3 divisble by 2 , 3 , 4 (Check for each number)
                       if it is divisble print : x is divisble by 2 True
                       if it is not divisble print : x is divisble by 2 False
         */
        //if divisble by another number when you divide you should have reminder as a 0
        //example 10 is divisble by 2 reminder will be 0 10 % 2 = 0
        boolean divisbleBy2 = x % 2 ==0; // if reminder 0 this should be true if its not then this should be false
        boolean divisbleBy3 = x % 3 ==0;
        boolean divisbleBy5 = x % 5 ==0;

        System.out.println(x + " is divisble by 2 - " + divisbleBy2);
        System.out.println(x + " is divisble by 2 - " + divisbleBy3);
        System.out.println(x + " is divisble by 2 - " + divisbleBy5);



    }
}
