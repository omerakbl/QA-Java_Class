package Test_Night_017;

public class c5_MaxNumber {

    // create a method that will accept 2 different number,
    // and it will print me the maximum one

    public static void maxNumber(int number1, int number2){

        if (number1>number2){
            System.out.println(number1 + " is bigger than " + number2);
        } else if (number2>number1){
            System.out.println(number2 + " is bigger than " + number1);
        } else {
            System.out.println(number1 + " is equal " + number2);
        }

    }
    public static void main(String[] args) {
        maxNumber(20, 30);
        // number 1 = 20
        // number 2 = 30

        maxNumber(40, 50);
        // number 1 = 40
        // number 2 = 50

        int i1 = 75;
        int i2 = 100;
        maxNumber(i1,i2);
        // number 1 = i1 = 75
        // number 2 = i2 = 100
     }
}
