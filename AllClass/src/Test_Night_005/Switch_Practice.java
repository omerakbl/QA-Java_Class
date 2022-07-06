package Test_Night_005;

public class Switch_Practice {
    public static void main(String[] args) {
        // Duplicate case are not allowed
        // The value for a case must be of the same data type as the variable in the switch. (or smaller than switch)
        // the value for a case mus be a constant or a literal. Variables are not allowed.
        // The break statement is used inside the switch to terminate a statement sequence
        // The break statement is optional. If omitted, execution will continue an into the next case.
        // The default statement is optional and can appear anywhere inside the switch block.
        //             In case, if it is not at the end, then a break statement must be kept after the
        //             default statement to avoid the execution of the next case statement.
        // Accepted Data Types
        // The variable  passed as switch argument can be one of following:
        // char
        // byte
        // short
        // int
        // String
        // Integer, Short, Byte, Character, enum


        int day = 3;
        // long l1 = 5;           not acceptable
        // double d1=3;           not acceptable
        // float f1=2;            not acceptable
        // boolean bool1=true;    not acceptable
        int number = 5;
        String dayType;
        String dayName; // empty you didn't assign anything yet.

        switch (day){
            case 1 : dayName = "Monday"; //  1 as a default is int
            break;
            case 2 : dayName = "Tuesday";
                break;
            case 3 : dayName = "Wednesday";
                break;
            case 4 : dayName = "Thursday";
                break;
                // case number: case cannot be assigned to variable
            case 5 : dayName = "Friday"; // case value us 5 in here you can't assign any variable
                break;
            case 6 : dayName = "Saturday";
                break;
            case 7 : dayName = "Sunday";
                break;
            default: dayName = "Invalid day";
        }


        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
            default: dayType= "Invalid day";
        }
        System.out.println( day + " is a " + dayName );
        System.out.println( day + " is a " + dayType );
        System.out.println( dayName + " is a " + dayType );




         }
}
