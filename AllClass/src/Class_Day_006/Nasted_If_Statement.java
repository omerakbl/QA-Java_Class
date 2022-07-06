package Class_Day_006;

public class Nasted_If_Statement {

    public static void main(String[] args) {

        // Nested if Statement {

            // if number is zer just print
            // if number is even and less than 50 double it
            // if number us odd and less than 70 triple

            int number  = 72;

            if (number == 0){

                System.out.println("The number is: " +number);
            }
            else if(number % 2 == 0 ){
                number = number*2;

                if (number<50){
                    number = number *2;

                }
                else{
                    number = number*4;

                }
            }
            else{
                if(number<70){
                    number = number*3;
                }
                else {
                    number=number*6;
                }
            }
            System.out.println(number);

        }
    }





