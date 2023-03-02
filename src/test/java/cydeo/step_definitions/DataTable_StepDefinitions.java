package cydeo.step_definitions;

import cydeo.pages.DropdownPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {


    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);


    }



    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        DropdownPage dropdownPage = new DropdownPage();
        Select select = new Select(dropdownPage.dropdownItems);

        List<WebElement> dropdownOption = select.getOptions();
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : dropdownOption) {
            actualOptions.add(each.getText());
        }

        Assert.assertEquals(expectedMonths, actualOptions);


    }









}
