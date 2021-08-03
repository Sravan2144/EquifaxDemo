package StepDefinitions;

import PageObjects.AmazonHomePage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public SearchSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }

    
    @Given("^Amazon Home Page$")
    public void amazon_Home_Page()  {
       
    }

    @When("^Seach for \"([^\"]*)\" and click on search button$")
    public void seach_for_and_click_on_search_button(String arg1)  {
    	AmazonHomePage home = new AmazonHomePage(driver, wait);
        home.searchAndClick(arg1);
       
    }

    @Then("^User able to see search result$")
    public void user_able_to_see_search_result()  {
       
    }

   
}