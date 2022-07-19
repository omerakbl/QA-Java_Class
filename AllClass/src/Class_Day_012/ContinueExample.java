package Class_Day_012;

public class ContinueExample {
    public static void main(String[] args) {

        // Write a code where checks every chars in a string and when it sees a "L" or "A" pass

        String input= " HELLOAPPLE";
        String result = "";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'L' || input.charAt(i) == 'A' || input.charAt(i) == 'E'){
                continue;

            }
            result = result + input.charAt(i);
            System.out.println(result);

        }

    }
}
