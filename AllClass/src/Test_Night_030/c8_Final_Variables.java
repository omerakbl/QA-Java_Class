package Test_Night_030;

public class c8_Final_Variables {

    // all final variables are not changeable
    // once you assign they will take the value and that will be final value.


    // specifier   : final
    //

    // final int isntanceVrble; final instance variables needs to assign when you created
    // final static int staticvariable;  final static variables needs to assign when you created
    final int instanceVrble=100;
    final static int staticVrble=200;

    public static void main(String[] args) {
        //loca vrble

        final int number;
        number=10;
        //number=20;


        c8_Final_Variables obj=new c8_Final_Variables();
        System.out.println("obj.instanceVrble = " + obj.instanceVrble); //100
        //obj.instanceVrble=200;   varible is final

        c8_Final_Variables obj2=new c8_Final_Variables();
        //obj2.instanceVrble=300;  //variable is final

        System.out.println("staticVrble = " + c8_final_variables.staticVrble);
        //staticVrble=300;  variable is final

        //number=20;
    }
}
