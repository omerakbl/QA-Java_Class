package Test_Night_028;

public class EmployeeObject {

    public static void main(String[] args) {
        SDET sdet1 = new SDET("Lucas", 25,12315421,"QA III", 4444.5);

        System.out.println(sdet1);

        Developers dev1 =new Developers("Lucas",1235123,"Developer", 25,200);
        System.out.println(dev1);

        sdet1.foundBug();
        dev1.fixingBug();

        ScrumMaster aydin=new ScrumMaster("Osman","Scrum Master",2342342);
        aydin.age=35;
        aydin.salary=160;
        System.out.println(aydin);
    }

    //biggest parent                       Employee
    //parent that extend Employee          DevTeam
    //child that extend DevTeam            Developer





}
