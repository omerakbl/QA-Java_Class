package Class_Day_018;

public class ForEachWithStringMethod {
    public static void main(String[] args) {

        String stName = "Lucas";

        char [] tc = stName.toCharArray(); // this will create a char array

        for (char ch:tc) { // We can iterate on the char array

            System.out.println("The chars: " + ch ); // Print all the chars

        }

        System.out.println("************************ ");

        String cool = "Java is cool but it is hard";

        String [] wrd = cool.split(" "); // it will create a string array with from the string by spliting

        for (String words:wrd){
            System.out.println("Word are is : " + words);
        }


    }
}
