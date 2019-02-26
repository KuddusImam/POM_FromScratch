package Pages;

import Utilities.ConfigurationReader;
import Utilities.TestBase;
import Utilities.credentials;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends TestBase {

    public Elements(){
        PageFactory.initElements(driver, this);
    }

    public @FindBy(xpath = "//*[@id='uh-signin']")
    WebElement signIn;

    public @FindBy(id = "login-username")
    WebElement userName;

    public @FindBy(id = "login-passwd")
    WebElement password;

    public void loginProcess(){
        // when we use credentials class, we use method below
//        driver.navigate().to(credentials.getBrowser());
//        wait.until(ExpectedConditions.visibilityOf(signIn));
//        signIn.click();
//        wait.until(ExpectedConditions.visibilityOf(userName));
//        userName.sendKeys(credentials.getUserName()+ Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOf(password));
//        password.sendKeys(credentials.getPassword()+ Keys.ENTER);

        //when we use configuration.properties file, we use method below
        driver.navigate().to(ConfigurationReader.getInfo("WebsiteAddress"));
        wait.until(ExpectedConditions.visibilityOf(signIn));
        signIn.click();
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(ConfigurationReader.getInfo("userName") + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(ConfigurationReader.getInfo("password") + Keys.ENTER);

    }



}
