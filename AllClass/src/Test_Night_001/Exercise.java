package Test_Night_001;

public class Exercise {
    public static void main(String[] args) {

        int z = 50;

        z = z - (z-z+50);
        System.out.println(z);

        z -=  z -z + 50;
        System.out.println(z);

        int t= 100;

        t = t -(t-t+200);
        System.out.println(t);

        int i=20;

        i -= i+i-i+5;   // i = -20 -- i+i = 0 i=-20 - 15 //
        System.out.println(i);

        i -=  i+i-i+5;
        System.out.println(i);

        i = i + (i+i-i+5);

        System.out.println( (i) +  "This the first one");

        i += i+i-i+5;

        System.out.println( (i) +  " this is the second one");




    }
}
