package Class_Day_006;

public class If_Else_Cont {

    public static void main(String[] args) {

        // Water temp is 100 it is boiling
        // Water temp is 0 it is freezing
        // Water tempo is 0<temp<10 So cold
        // Water temp between 10-30  Cold
        // Water temp 60-90 Hot
        // Water temp 90<temp<100

        String waterCond;

        byte waterTemp = 45 ;

        if (waterTemp == 100 ){

            waterCond = "Boiling";

            System.out.println("Water condition is : " + waterCond);

        }
        else if (waterTemp == 0) {

            waterCond = "Freezing";
            System.out.println("Water condition is : " + waterCond);

        }
        else if (waterTemp >= 0 && waterTemp<=10) {

            waterCond = "So cold";
            System.out.println("Water condition is : " + waterCond);

        }

        else if (waterTemp>10 && waterTemp<30) {

            waterCond = "cold";
            System.out.println("Water condition is : " + waterCond);

        }
        else if (waterTemp>=60 && waterTemp<90) {

            waterCond = "Hot";
            System.out.println("Water condition is : " + waterCond);

        } else if (waterTemp>=90 && waterTemp<100) {

            waterCond = "So hot";
            System.out.println("Water condition is : " + waterCond);

        }
        else {

            waterCond = "Room temperature";
            System.out.println("Water condition is : " + waterCond);
        }


    }
}
