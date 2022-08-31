package Test_Night_031.Drivers;

public class DriverObject {

    public static void main(String[] args) {
        ChromeDriver obj1 = new ChromeDriver();
        obj1.openBrowser();
        obj1.getURL("google");
        obj1.closeBrowser();

        FireFox obj2 = new FireFox();
        obj2.openBrowser();
        obj2.getURL("facebook");
        obj2.closeBrowser();
    }
}
