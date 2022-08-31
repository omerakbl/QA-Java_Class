package Test_Night_031;

public abstract class Shape {

//specifier is :Abstract

    //abstract classes are meant to be inherited
    //can not be final

    //abstract method : those methods will be without body
    //those methods are meant to be overrwite
    //those methods can not be final,static or priavate.

    //public void method(){body}
    //public abstract void method();

//abstraction is another oop concept in java
    //main idea of abstraction : abstraction is a process of hiding the implementation details from the user,
    // only the functionality will be provided to the user.
    // In other words, the user will have the information on what the object does instead of how it does it.

    //2 ways to achive abstraction
    //1.Abstract Class ,methods
    //2.Interface

    //task :
    //create an abstract base class call shape which will has method call area,shapeName
    //create child classes called rectangle , square ... that will overwrite method area,shapeName

    //abstract void shapeArea(){};
    abstract void shapeArea(); // this method needs to be override it depends on shape are

    abstract void shapeName(); // abstract method will be without body
 }
