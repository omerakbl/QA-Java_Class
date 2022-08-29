package Test_Night_026;

public class StaticBlock2 {

    static int a = 10;
    static int a2 = 1;
    int b;

    public static void main(String[] args) {

        StaticBlock2 sb2 = new StaticBlock2();
        System.out.println(sb2.b);
        System.out.println(a);

    }

    static {
        a = 25;
        System.out.println("Hello");
        a2=200;

        if (10>5){
            a =35;

        }else {
            a2 = 50;
        }

    }
}
