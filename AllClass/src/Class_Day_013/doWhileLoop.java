package Class_Day_013;

public class doWhileLoop {
    public static void main(String[] args) {
        // The Concept do while Loop is
        // do{
        // code block
        // }while(condition);

        int i = 0;
        do {
            System.out.println("The i value : " + i);
            i++;
        }while (i<10);

        System.out.println("\n ********************** \n");

        int j =9;
        do {
            if (j < 10) {
                System.out.println("The i value : " + j);
                j++;
            }
        }
            while (j<10);

    }
}
