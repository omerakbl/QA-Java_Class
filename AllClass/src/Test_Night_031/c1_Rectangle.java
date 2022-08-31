package Test_Night_031;

public class c1_Rectangle extends Shape {

    public final String shapeName = "Rectangle";
    public double width;
    public double length;

    // inheritance extends
    // Abstract shapeArea inherited
    // Abstract shapeName inherited
    // after extending Shape class we will see an error because java  is telling you
    // you need to override those abstract methods that are coming from shape class
    // abstract methods are meant to be override


    public c1_Rectangle(double width, double length){ // constructor any time i created object from it will use this constructor
        this.width = width;
        this.length = length;
    }
    @Override
    public void shapeArea(){
        //rectangle area = width * length
        double area = width * length;
        System.out.println("Area of " + shapeName + " is " + area);

    }

    @Override
    public void shapeName(){
        System.out.println(shapeName);

    }

    // as soon as we Override abstract method error will be disappear
}
