package Test_Night_020;

public class c5_ReverseString {

    public static void reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }


    public static void main(String[] args) {
        reverse("lucas");

        String reverse = reverse2("Lucas");

        System.out.println(reverse);
    }




    public static String reverse2(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse += str.charAt(i);

        }
        return reverse;
    }
}
