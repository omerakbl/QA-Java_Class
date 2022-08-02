package Class_Day_013;

public class WhileLoopCont {
    public static void main(String[] args) {

        int i =0;
        while (i<10){
            i++;
            System.out.println("The i values  : " + i);
            // i++; // it is important to know when to increase the i value

        }

        System.out.println("\n**************************\n");

        int j = 0;
        while (j<=10) {
            //j+=2;
            if (j == 8) {
                j +=  2;
                continue;
            }
            System.out.println("ASLKDASLKDKA " + j);
            j+=2;
        }
        System.out.println("\n**************************\n");

        int x = 0;
        while (x<=10){
            // System.out.println(x); // 0,1,2,3,4,5,6,7,8,9
            if (x==9){
                break;
            }
            System.out.println(x); // 0,1,2,3,4,5,6,7,8
            x++;
        }

        }

    }

