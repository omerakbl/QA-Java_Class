package Homework_06;

import java.util.Scanner;

public class Chalange {
    /**
     * Please see the instruction below for the Assignment
     * Write a code where it calculates the shortest distance from the starting point to the ending point
     * 1) User is entering the number of miles.
     * 2) Then the user enters the direction (“W” or “w”  for the west, “N” or “n” for North, “E” or “e” for East, “S” or “s” for South,
     * (enter the number of the miles: 2)
     * (Enter the direction: W)
     * 3) This will continue until the user is done entering the miles and directions(Check out the previous example: for instance “If you are done please enter 0”)
     * 4) Find the shortest distance between Starting Point and the End Point with the direction, ( Hint: The hypotenuse theory,
     * To find the square root of a number, you can use Math.sqrt(number) see the example don’t the screenshot below)
     * <p>
     * <p>
     * 5) See the example below.
     * 6) Based on the Screenshot provided your output or answer should be  ( The Answer is: 4.472213 Miles NorthEast)
     * 7) If the endpoint and starting point are the same your output or the answer should be (The Answer is: You are at the Starting Point)
     * 8) You are only allowed to you the topics we have covered so far except Math.sqrt() // which is a Math method returns to the Square root of a number
     * 9) Please do it yourself. Do NOT as your developer or QA engineer friends. Be fair to everyone in the class. Ask on the Comments if you have any questions about the assignment
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String direction ;
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        int eastWest;
        int northSouth;
        String result = "";

        while (true) {

            System.out.println("Please enter the mile");
            int mile = sc.nextInt();
            if (mile == 0)
            {

                eastWest = east - west; // ----- eastWest
                northSouth = north - south; // ---- northSouth

                float root = (float) Math.sqrt( ( eastWest * eastWest ) + ( northSouth * northSouth ) );
                System.out.println(root + " " + result);
                break;
            }

            System.out.println("Please enter your direction");
            direction = sc.next();

            if (direction.contains("N") || direction.contains("north"))

            { north = north + mile; }

            else if (direction.contains("S") || direction.contains("south"))

            { south = south + mile; }

            else if (direction.contains("W")  || direction.contains("west"))

            { west = west + mile; }

            else if (direction.contains("E") || direction.contains("east"))

            { east = east + mile; }
            else {
                System.out.println( "You are at the starting point" );

            }

            if (north>south && west>east)
            { result = "North West"; }

            else if (north>south && east>west)
            { result = "North East"; }

            else if (south>north && west>east)
            { result = "South West"; }

            else if (south>north && east>west)
            { result = "South East"; }

            if (north == 0 && south == 0) {
                if (east == 0 && west == 0){
                    result = "You are at the starting point";
                }
            }
        }


    }
}


