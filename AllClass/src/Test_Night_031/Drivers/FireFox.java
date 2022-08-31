package Test_Night_031.Drivers;

public class FireFox extends Driver{

    public final String driverName = "FireFox";
    @Override
    public void openBrowser() {
        System.out.println( driverName + " is Opening ");
    }

    @Override
    public void getURL(String url) {
        System.out.println("Opening" + url + " in " + driverName );
    }
}
