package Test_Night_021;

public class c2_MethodOverloadingPractice {
    public static void main(String[] args) {

        sumOf2Numbers(5,5);
        sum(10,10);

        System.out.println("----------------------------");

        sumOf3Numbers(5,5,5);
        sum(10,10,10);

        sum(5.5,10.0);

    }

    //1. print sum of int number
    //2. print sum of 3 int number
    //3. print sum of 2 double number

    public static void sumOf2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sumOf3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b,int c){
        System.out.println(a+b+c);

    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }
}
