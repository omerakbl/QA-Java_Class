package Class_Day_007;

public class Switch_Cont {
    public static void main(String[] args) {

        String x= "Mo";

        String day;


        switch (x) {

            case "Mo": day="Monday";
            break;

            case "Tu": day="Tuesday";
                break;

            case "We": day="Wednesday";
                break;

            case "Th": day="Thursday";
                break;

            case "Fr": day="Friday";
                break;

            case "St": day="Saturday";
                break;

            case "Sn": day="Sunday";
                break;
            default: day = "Culdnt find any day";
        }
        System.out.println(day);


    }
}
