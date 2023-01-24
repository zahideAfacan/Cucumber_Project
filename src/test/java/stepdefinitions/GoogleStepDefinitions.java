package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinitions {
        GooglePage googlePage=new GooglePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        //write the java code
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }
    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        // Write code here
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify page title contain iPhone")
    public void verify_page_title_contain_i_phone() {
        // Write code here
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @Then("close the application")
    public void close_the_application() {
        // Write code here
        Driver.closeDriver();
    }
    @When("user search for TeaPot")
    public void user_search_for_tea_pot() {
        // Write code here
        googlePage.searchBox.sendKeys("TeaPot"+Keys.ENTER);
    }
    @Then("verify page title contain TeaPot")
    public void verify_page_title_contain_tea_pot() {
        // Write code here
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));

    }
    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
       googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }
    @Then("verify page title contains {string}")
    public void verify_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }



}
