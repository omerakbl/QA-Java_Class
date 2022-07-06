package Class_Day_006;

public class Ternary_Example_2 {
    public static void main(String[] args) {

        //Point > 100 or <0 - Out of range
        // 90 - 100 Grade A
        // 80 - 90 Grade B
        // 70 - 80 Grade C
        // 60 - 70 Grade D
        // 50 - 60 Grade F
        // Less than 50 Grade failed

        // && and
        // || or
        // !  not

        int Points = 89;
        String grade;

        grade = (Points<0 || Points>100)? "Out of range" :

                (Points>=90 && Points<=100)? "A": // 90 100

                        (Points>=80 && Points<90)? "B": // 80-89

                                (Points>=70 && Points<80)? "C" : // 70 79

                                        (Points>=60 && Points<70)? "D" : // 60 69

                                                (Points>=50 && Points<60)? "F" : "Out of the range" ; // 0 59 FAIL

        System.out.println("Student grade is  = " + grade);

    }
}
