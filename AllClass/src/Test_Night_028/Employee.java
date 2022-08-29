package Test_Night_028;

public class Employee {

    // the goal of this task to create SDET,Developer,ScrumMaster

    // name
    // JobId
    // jobTitle
    // age
    // salary

    public String name;
    public long jobID;
    public String jobTitle;
    public int age;
    public double salary;

    public  String toString(){
        return "Name : " + name + " JobTitele " + jobTitle + " Age : " + age + " ID " + jobID;

        //parent Class will be                              Employee
        //child class of Employee      SDET   Developers   ScrumMaster    BA   PO DataAnalyst

    }
}
