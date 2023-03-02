package cydeo.step_definitions;

import cydeo.pages.WikipediaPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }


    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikipediaPage.searchBox.sendKeys(string);

    }


    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikipediaPage.searchButton.click();

    }


    @Then("user sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }


    @Then("user should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String string) {

        Assert.assertEquals(string, wikipediaPage.mainHeader.getText());

    }












}
