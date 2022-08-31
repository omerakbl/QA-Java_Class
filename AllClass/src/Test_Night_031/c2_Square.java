package Test_Night_031;

public class c2_Square extends Shape {

    public final String shapeName = "Square";
    public  double length;

    public  c2_Square(double length){
        this.length = length;
    }
    @Override
    void shapeArea() {
        // area of square is length * length
        System.out.println("Area of " + shapeName + " is " + (length * length));
    }

    @Override
    void shapeName() {
        System.out.println("Shape name is : " + shapeName);
    }

    // inheritance extends
    // Abstract shapeArea inherited
    // Abstract shapeName inherited

    // area of square is length
}
