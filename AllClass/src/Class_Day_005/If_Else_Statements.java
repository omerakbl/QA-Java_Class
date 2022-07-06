package Class_Day_005;

public class If_Else_Statements {

    public static void main(String[] args) {

         int x = 10;

        if ( x>9){
            System.out.println(" x is bigger then 10");
        }

        else {

            System.out.println(" x is equal then 10");

        }



        String pName = "Ziya ";
        int TeachingSkills = 100;
        int forgetMain = 100;

        if (TeachingSkills>99 && forgetMain<0){
            System.out.println(pName + " is not accepted for meme channel");
        }
        else {
            System.out.println(pName + " is qualified for meme channel ");
        }

        String userName = "sample@sample.com";
        int usernameLenght = userName.length();

        if (usernameLenght < 10){
            System.out.println( userName + " able to login");
        }

        else {
            System.out.println(userName + " NOT ABLE TO LOGIN");
        }

        String userPassword = "password";
        int userpasswordLenght = userPassword.length();

        if (userpasswordLenght<5){

            System.out.println(userPassword + " able to login");

        }
        else {
            System.out.println( userPassword + " is not long enough");
        }







    }
}
