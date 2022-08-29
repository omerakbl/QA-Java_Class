package Day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class firstCode {
    public static void main(String[] args) {

        // Create connection between selenium and browser
        // setup browser

        WebDriverManager.chromedriver().setup();

        // create instance of chromedriver
        WebDriver driver = new ChromeDriver();

        // go to google
        driver.get("https://www.google.com/");


    }
}
