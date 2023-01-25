package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    @Given("user enters cutomer_email and customer_password")
    public void user_enters_cutomer_email_and_customer_password(DataTable credentials) {
        //1. way get data as a list

  //      List<String> customerData = credentials.row(1);//row index start at 0
       // System.out.println(customerData.get(0));
      //  System.out.println(customerData.get(1));
  //      loginPage.username.sendKeys(customerData.get(0));
  //      loginPage.password.sendKeys(customerData.get(1));
  //      loginPage.loginButton.click();

        // 2. way get dayta as ,lLIST<MAP<STRING,STRING>>
        List<Map<String,String>> customerData = credentials.asMaps(String.class,String.class);
        for (Map<String,String> each :customerData){
            loginPage.username.sendKeys(each.get("username"));
            loginPage.password.sendKeys(each.get("password"));
            loginPage.loginButton.click();
        }
    }
    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {
        Assert.assertTrue(homePage.userID.isDisplayed());
    }
    @Then("verify the next page url contains login keyword")
    public void verify_the_next_page_url_contains_login_keyword() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

}
