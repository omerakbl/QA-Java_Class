package Class_Day_004;

public class Pre_Post_Condition {

    public static void main(String[] args) {
        // pre : this will change the value of number immediatly
        // ++num
        // post : first wont gonna change anything on the variable , at the end it will change it on the next line
        // num++

        int num = 0;
        System.out.println(++num); //
        System.out.println(num++); //
        System.out.println(--num); //
        System.out.println(num);   //


    }
}
