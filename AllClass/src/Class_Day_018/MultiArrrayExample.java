package Class_Day_018;

public class MultiArrrayExample {
    public static void main(String[] args) {


        String [] [] names = { {"OSMAN","HAYDAR"}, {"LUCAS"}, {"HAYAT","COK","ZOR"}, {"JAVA","IS,COOL"} };

        // In order for me to get "Java" names [3] [0]

        System.out.println("Get Java in index of [3] [0] :" + names [3] [0] );

        int [] one = new int [3]; // {0,0,0}

        int [] [] two = new int[3] [3]; // { {0,0,0}, {0,0,0}, {0,0,0} } // it will fill with thr default values

        System.out.println("The last element in the array : " + two[2] [2]);

        // each value in the two array is greater the previous one by 5;

        // {{5,5,5}, {5,5,5}, {5,5,5}}

        for (int i = 0; i < two.length; i++) {

            for (int j = 0; j < two[0].length; j++) {  // two[0], two[1], two[2] has the same size so

                two[i] [j] = two [i] [j] + 5;

            }

        }
    }
}
