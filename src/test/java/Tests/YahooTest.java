package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest {

    WebDriver driver;

    @BeforeMethod
    public void setUps(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }

    //we can't use main method to run @Test. since the main method is run as Java application
    //the test should be run as testNG

    @Test(priority = 1)
    public void firstTest(){
        driver.navigate().to("http://www.yahoo.com");
    }

    @Test(priority = 2)
    public void secondTest(){
        driver.navigate().to("http://www.google.com");
    }

    @Test(priority = 3)
    public void thirdTest(){
        driver.navigate().to("http://www.facebook.com");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}
