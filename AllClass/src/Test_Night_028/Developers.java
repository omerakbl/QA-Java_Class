package Test_Night_028;

public class Developers extends Employee{
    //task says have Developer name,jobID,jobtitle,salary
    // function developing() , fixingBug()

    // name             (inherited)
    // JobId            (inherited)
    // jobTitle         (inherited)
    // age              (inherited)
    // salary           (inherited)

    // function developing() , fixingBug() needs to be create since they are unique for only developers
    public Developers(String name, long jobID, String jobTitle, int age, double salary) {
        this.name=name;
        this.jobID=jobID;
        this.jobTitle=jobTitle;
        this.age=age;
        this.salary=salary;

    }

    public void developin(){
        System.out.println(name + " is developing program ");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing bug ");
    }
}
