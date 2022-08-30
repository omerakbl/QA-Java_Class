package Test_Night_030;

public class c5_Finally_Block {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
            System.out.println(92/0);
        }catch (Exception e){

        }finally {
            System.out.println("Final");
        }

        // how finally block works :
        // finally block will get executed n matter where try catch will try to catch
    }
}
