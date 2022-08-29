package Test_Night_026;

public class RenastechStudent {

    //name
    //number
    //school name : Renastech

    //since school name not going to change always it will be better if i assign static
    //and assigned one time at the beginning

    String name;
    int number;

    //static variable
    static  String schoolName;

    //instead of hardcoding student number we will create a counter that will count students and assign unique number
    static int countNumbers=0;

    public void setStudentInfo(String name){//aydin //ramazan
        this.name=name;

        number=setStudentNumber();

    }

    //this method will increase student number and return an integer value as a unique number
    public static int setStudentNumber(){
        countNumbers++;//1 2 3
        return countNumbers;

    }

    //
    public static void setSchoolName(String schlName){
        schoolName=schlName;
    }

    //get information
    public void getStudentInfo(){
        System.out.println("Name of Student : " + name);
        System.out.println("Student Number : " + number);

        //accesing static variable
        System.out.println("School Name : " + schoolName);
    }

    //
    public String toString(){
        return "Name :"+name+ " , Student Number : "+number;
    }



}
