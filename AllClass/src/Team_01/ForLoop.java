package Team_01;

public class ForLoop {
    public static void main(String[] args) {

        String name = "Omer";
        String reverse = "";

        for (int i = name.length()-1; i>=0; i--) {

            reverse = reverse+name.charAt(i);
            System.out.println(i);


        }
        System.out.println(reverse);





    }
}
