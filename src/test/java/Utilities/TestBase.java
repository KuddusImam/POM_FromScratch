package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public MyLibrary myLib;
    public static WebDriverWait wait;
    public static Actions act;

    @BeforeClass
    public void setUpClass(){

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpMethod(){
        driver = new ChromeDriver();
        myLib = new MyLibrary(driver);
        wait = new WebDriverWait(driver,50);
        act = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
