package Test_Night_031;

import MyLibrary.Library;

public class ShapeObjects {

    public static void main(String[] args) {
        c1_Rectangle obj = new c1_Rectangle(5,7);
        // Area 5*7 == 35
        obj.shapeName();
        obj.shapeArea();

        Library.stars();

        c2_Square obj2 = new c2_Square(5);

        //Area 5*5 = 25

        obj2.shapeName();
        obj2.shapeArea();
    }
}
