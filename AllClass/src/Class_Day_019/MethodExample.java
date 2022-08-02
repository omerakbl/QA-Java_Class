package Class_Day_019;

public class MethodExample {
     /*
         declaration of the method
         public                   static               void                 main                (String[] args){
         Access-modifier          specifier            return-type         method-Name          (parameter)
      */

    public static void  Method (){
        System.out.println("This is my first method and not the last one");
    }
    public static void SumTheNumbers (int a, int b){

        int sum = a + b;

        System.out.println("Te Sum of the a and b is : " + sum);

        Method(); //  Calling a method inside another method

    }
    public static void main(String[] args) {

        // Method();
        System.out.println("This is inside of main method");
        Method();

        SumTheNumbers(7,10);
    }
}
