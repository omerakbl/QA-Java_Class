package Test_Night_025;

public class Animals {

    String type; // instance variable
    double age;
    String color;
    String name;

    public void setAnimalInfo(String type, double age, String color, String name){

        this.type = type;
        // if your method has same named with the instance variable
        // use this keyword to point your instance variable
        this.age = age ;
        //color = color; we need to tell java which one is the instance variable
        this.color = color ;
        this.name = name ;

    }

    // this method will print us all information about animal
    public void getAnimalInfo(){
        System.out.println(name + " , " + age +  " , " +  color +  " , " + type);
    }

    // this method will present one function for the animal object
    public void eating(String food){
        System.out.println(name + " is eating " + food);
    }
    public void getType(){
       System.out.println(name + " is a " + type);
   }

    public String toString(){

        return " Name of animal : " + name + " , age of animal " + age + " , Color of animal : " + color + " , Type of animal " + type;
    }


}
