package Test_Night_028;

public class SDET extends Employee{

    //task says have SDET name,jobID,jobtitle,salary
    // function testing() , foundBug()

    // name             (inherited)
    // JobId            (inherited)
    // jobTitle         (inherited)
    // age              (inherited)
    // salary           (inherited)

    public SDET(String name, int age, long jobID, String jobTitle, double salary){
        this.name=name;
        this.age=age;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    // function testing() , foundBug()
    public void testing(){
        System.out.println(name + " is testing ");
    }
    public void foundBug(){
        System.out.println(name + " is founded bug");
    }


    public static void main(String[] args) {

    }
}
