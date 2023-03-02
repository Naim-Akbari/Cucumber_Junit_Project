package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage () {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//input[@name='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath = "//h1[@id = 'firstHeading']")
    public WebElement mainHeader;



}
