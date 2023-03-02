package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[.='Login']")
    public WebElement loginButton;


    public void login () {
        usernameInput.sendKeys("Test");
        passwordInput.sendKeys("Tester");
        loginButton.click();
    }

    public void login (String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginWithConfig () {
        usernameInput.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }









}
