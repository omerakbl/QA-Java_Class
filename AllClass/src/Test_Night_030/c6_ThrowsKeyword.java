package Test_Night_030;

public class c6_ThrowsKeyword {
        public static void main(String[] args) throws Exception {

        //there is 2 way to handle exceptions so they dont stop compiler from running
        //first you can use try/catch blocks to handle
        //second you can use throws keyword to handle


        //throws keyword will be assigned to your method signature
        System.out.println("start");
        Thread.sleep(2000);
        System.out.println("Waited 2 second");

        Thread.sleep(3000);
        System.out.println("Waited extra 3 second");

        try {
            System.out.println(10/0);
        }catch (Exception e){

        }

        System.out.println("Hello");



    }
}
