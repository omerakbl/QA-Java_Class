package Class_Day_005;

public class If_ElseIf_Else {

    public static void main(String[] args) {

        /*
        If(condition){
        }
        else if (another conditon){
        }
        else if (another conditon){
        }
        else{
        }

         */

        int x = 100;
        if (x>100){
            System.out.println(x + " is bigger then 100");
        }
        else if (x<50) {

            System.out.println(x + " is smaller then 50");

        }
        else {

            System.out.println("Your number is :" + x);

        }

        System.out.println("***************************");


        String userName = "example@example.com";
        String password = "any-password";

        int userNameLenght = userName.length();
        int passwordLenght = password.length();

        if (userNameLenght>30 || passwordLenght>25){

            System.out.println("Username or Password not strong enough");
        } else if (userNameLenght<10 || passwordLenght<10) {

            System.out.println("Username or Password not strong enough");

        } else {
            System.out.println("Welcome to your account");

        }





    }
}
