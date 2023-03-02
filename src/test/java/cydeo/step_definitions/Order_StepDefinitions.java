package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.OrderPage;
import cydeo.pages.ViewAllOrdersPage;
import cydeo.pages.WebTablePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTablePage.login();
        basePage.orderButton.click();
    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(productType);

    }


    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {

        orderPage.quantityInput.clear();
        orderPage.quantityInput.sendKeys(String.valueOf(quantity));

    }



    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {

        orderPage.nameInput.sendKeys(customerName);

    }


    @When("user enters street {string}")
    public void user_enters_street(String streetName) {

        orderPage.streetInput.sendKeys(streetName);

    }


    @When("user enters city {string}")
    public void user_enters_city(String cityName) {

        orderPage.cityInput.sendKeys(cityName);

    }


    @When("user enters state {string}")
    public void user_enters_state(String stateName) {

        orderPage.stateInput.sendKeys(stateName);

    }


    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {

        orderPage.zipInput.sendKeys(zipcode);

    }


    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String creditCardType) {

        for (WebElement webElement : orderPage.cardType) {
            if (webElement.getAttribute("value").equalsIgnoreCase(creditCardType)) {
                webElement.click();
            }
        }

    }


    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String creditCardNumber) {

        orderPage.cardNumberInput.sendKeys(creditCardNumber);

    }


    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDate) {

        orderPage.cardExpiryInput.sendKeys(expiryDate);

    }


    @When("user enters process order button")
    public void user_enters_process_order_button() {

        orderPage.processOrderButton.click();

    }


    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

        Assert.assertEquals(viewAllOrdersPage.name.getText(), string);

    }

    
    
    
    
    
}
