package Test_Night_030;

import java.util.NoSuchElementException;

public class c4_MultiTryCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);//arithmeticexception
            Thread.sleep(1000);
        }catch (NoSuchElementException e){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out index");
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){

        }

        System.out.println("continue to test");
        //to be able to catch exception you need use same level exception or parents of exceptions
        //for ex : handling arithmetic exceptions will be with arithmetic,runtime,exceptions

        //in multi catch as soon as block catch it won't check other catch blocks


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
