package Test_Night_028;

public class ScrumMaster extends Employee{
    //task says have scrum master name,jobid,jobtitle,age,salary
    //function creatingScrumMeetings()

    //name (inherited)
    //jobId (inherited)
    //jobTitle (inherited)
    //age (inherited)
    //salary (inherited)

    //toString() (inherited)

    public ScrumMaster(String name,String jobTitle , long id){
        this.name=name;
        this.jobTitle=jobTitle;
        this.jobID=id;
    }

    //function creatingScrumMeetings()
    public void creatingScrumMeetings(){
        System.out.println(name +" is scheduled sprint planing meeting ");
    }
}
