package Tests;

import Pages.Elements;
import Utilities.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {

    //we can't use main method to run @Test. since the main method is run as Java application
    //the test should be run as testNG

    @BeforeMethod
    public void setUp2(){
        Elements e = new Elements();
        e.loginProcess();
    }


    @Test(priority = 1)
    public void firstTest(){

    }

    @Test(priority = 2)
    public void secondTest(){

    }

    @Test(priority = 3)
    public void thirdTest(){

    }



}
