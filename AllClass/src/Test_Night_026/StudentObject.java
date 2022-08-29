package Test_Night_026;

import MyLibrary.Library;

public class StudentObject {

    public static void main(String[] args) {

        //in static methods
        //to be able to call instance variable , instance method you would need to create an object

        //but for static members you dont need it

        //lets assign school name
        RenastechStudent.setSchoolName("Renastech");


       RenastechStudent studen1 = new RenastechStudent();

       studen1.setStudentInfo("Lucas");

        RenastechStudent studen2 = new RenastechStudent();

        studen2.setStudentInfo("Omer");

        studen1.getStudentInfo();
        studen2.getStudentInfo();

        RenastechStudent studen3 = new RenastechStudent();

        studen3.setStudentInfo("Blah");

        studen3.getStudentInfo();

        Library.stars();
        //this stars method was created a static method i didn't need to create an object from Library class
        //i can just call static method by using class name

        System.out.println(studen1);

        StudentObject so1=new StudentObject();
        //objects they are comming from specific custom classes

        //int,string ....


        //biggest one we have  object library
        //this will be apply for any custom classe

        //object
        //student car renas shoe


    }
}
