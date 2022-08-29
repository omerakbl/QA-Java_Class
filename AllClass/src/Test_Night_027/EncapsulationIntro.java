package Test_Night_027;

public class EncapsulationIntro {
    /*
     OOP PRINCIPLES : object-oriented programing language
•Encapsulation :(Data Hiding)
•Inheritance   :
•Abstraction   :
•Polymorphism   :
OOP  will combine group of related variables and functions to unit (object).
     */

    /*
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
Therefore, it is also known as data hiding.
To achieve encapsulation in Java −
1.Declare the variables of a class as private.
2.Provide public setter and getter methods to modify and view the variables values.
     */

    //to hide data first make the variables as private
    private String name;
    private String idNum;
    private int age;
    //nobody will have direct access of above variables

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }

    public void setIdNum(String newIDNum){
        idNum=newIDNum;
    }
    public String getIdNum(){
        return  idNum;
    }

    public void setAge(int newAge){
        age=newAge;
    }

    public int getAge(){
        return age;
    }


}
