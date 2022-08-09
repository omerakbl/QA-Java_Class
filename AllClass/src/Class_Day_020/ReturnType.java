package Class_Day_020;

public class ReturnType {
    /*
         declaration of the method
         public                   static               void                 main                (String[] args){
         Access-modifier          specifier            return-type         method-Name          (parameter)
         statements , code
         }

     */

    public static String Name(int a, int b){

        if (a > b){
            return "OMAR";
        }
        else if (b > a) {

            return "LUCAS";

        }
        else {
            return "HEADACHE";
        }

    }

    public static void main(String[] args) {
        String name =  Name(0,0);
        System.out.println("The name is : " + name);
    }
}
