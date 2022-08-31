package Test_Night_031.Drivers;

public class ChromeDriver extends Driver {

    public final String driverName = "Chrome";

    @Override
    public void openBrowser() {
        System.out.println( driverName + " is Opening ");
    }

    @Override
    public void getURL(String url) {
        System.out.println("Opening" + url + " in " + driverName );

    }
}
