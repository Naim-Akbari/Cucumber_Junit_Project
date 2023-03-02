package cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrderPage extends BasePage{

    @FindBy (css = "select[name='product']")
    public WebElement productDropdown;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement quantityInput;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement streetInput;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement cityInput;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement stateInput;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipInput;

    @FindBy (name = "card")
    public List<WebElement> cardType;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cardNumberInput;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement cardExpiryInput;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;



}
