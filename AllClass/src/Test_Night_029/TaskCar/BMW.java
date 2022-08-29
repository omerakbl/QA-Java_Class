package Test_Night_029.TaskCar;

public class BMW extends Car{

    //method overriding: same method name, same parameter, same return-type  (MUST)
//				   MUST happen in the subclass
//				   access modifier MUST be same or more visible
//				   ONLY the instance methods can be overridden
//				   @Override annotation MUST be applicable
//


    //start() inherited
    //stop()  inherited

    @Override // this will check if your method override or not
    public void startCar(){
        System.out.println("BMW is started");
    }

    //@Override
    public void bmwColor(){
        System.out.println("BMW is green");
    }
}
