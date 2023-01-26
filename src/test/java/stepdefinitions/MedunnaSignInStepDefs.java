package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

    @When("click on user icon")
    public void click_on_user_icon() {
        ReusableMethods.waitFor(1);
        medunnaHomePage.userIcon.click();

    }

    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        ReusableMethods.waitFor(1);
        medunnaHomePage.signInOption.click();
    }

    @And("enter {string} in username input")
    public void enterInUsernameInput(String username) {
        ReusableMethods.waitFor(1);
        medunnaLoginPage.usernameInput.sendKeys(username);

    }

    @And("enter {string} in password input")
    public void enterInPasswordInput(String password) {
        ReusableMethods.waitFor(1);
        medunnaLoginPage.passwordInput.sendKeys(password);

    }


    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {
        ReusableMethods.waitFor(1);
        medunnaLoginPage.rememberMeCheckbox.click();

    }

    @When("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
        ReusableMethods.waitFor(1);
        medunnaLoginPage.signInSubmitButton.click();

    }

        }
