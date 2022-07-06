package Class_Day_007;

public class SwitchStatements {

    public static void main(String[] args) {

        // The way it works is similar to the IF Statement
        //If we have a lot of condition to check it.

        /*
        variable name

        switch(name) {

        case ziya :
        case mahir :
         */

        int number = 6; //
        String month;

        switch (number) {

            case 1: month="January";
                break;
            case 2: month="February";
                break;
            case 3: month= "March";
                break;
            case 4: month="April";
                break;
            case 5: month="May";
                break;
            case 6: month= "June";
                break;
            case 7: month="July";
                break;
            case 8: month="August";
                break;
            case 9: month= "September";
                break;
            case 10: month="October";
                break;
            case 11: month="November";
                break;
            case 12: month= "December";
                break;
            default: month= "Invalid month";


        }
        System.out.println( "The month in the year is : " + month);


    }
}
