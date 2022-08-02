package Class_Day_019;

public class NastedForEachLoop {
    public static void main(String[] args) {

        int [] [] [] d3 = {{{1},{5,6,7,8,9},{1,2,3,4}},{{10,11,12,13}},{{0,1},{1,2,3}},{{1,2,3,4},{0,1,2,3},{1,2,3,4,5}}};

        for (int [][] d2:d3 ) {

            for (int [] d1:d2) {

                for (int x:d1) {

                    System.out.println("The values : " + x);

                }

            }
        }
    }
}
