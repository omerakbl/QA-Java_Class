package Test_Night_031.Drivers;

public abstract class Driver {

    //try this task with different driver types : Chrome,Firefox,Safari ...
    //Task : create a base abstract class
    //create a method call openBrowser  --- abstract method
    //create a method call getURL     ---abstract
    //create a method call closeBrowser (Closing browser)

    public abstract void openBrowser(); // no body
    public abstract void getURL(String url); // no need body needs to override
    public void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
