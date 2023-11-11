package cucumber_project.stepdefinitions;

import cucumber_project.pages.Day01_Background_Page;
import cucumber_project.utilities.ConfigurationReader;
import cucumber_project.utilities.Driver;
import cucumber_project.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    Day01_Background_Page page = new Day01_Background_Page();
    String expectedUrl = "";

    @Given("go to ets tour website")
    public void go_to_ets_tour_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etstur")); //the sites does not open
        ReusableMethods.wait(60);
        expectedUrl = Driver.getDriver().getCurrentUrl();
    }
    @Given("go to login button and wait")
    public void go_to_login_button_and_wait() {
        ReusableMethods.hover(page.loginandWait);
        ReusableMethods.wait(2);
    }
    @When("clikc the enter button")
    public void clikc_the_enter_button() {
        page.login.click();
        ReusableMethods.wait(2);
    }
    @When("write email")
    public void write_email() {
        page.email.sendKeys("oft@gmail.com");
        ReusableMethods.wait(2);
    }
    @When("write password")
    public void write_password() {
        page.password.sendKeys("gasfs46546");
        ReusableMethods.wait(2);
    }
    @When("clikt the login button")
    public void clikt_the_login_button() {
        page.clicklogin.click();
        ReusableMethods.wait(2);
    }
    @Then("confirm page cannot be navigated to")
    public void confirm_page_cannot_be_navigated_to() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @And("click the uye ol button")
    public void clickTheUyeOlButton() {
        page.uyeOl.click();
        ReusableMethods.wait(2);
    }

    @And("write name")
    public void writeName() {
        page.name.sendKeys("gdfsdfg");
        ReusableMethods.wait(2);
    }

    @And("write surname")
    public void writeSurname() {
        page.surname.sendKeys("gsfdgdfg");
        ReusableMethods.wait(2);
    }

    @And("write a login email")
    public void writeALoginEmail() {
        page.eposta.sendKeys("ffasf@gmail.com");
        ReusableMethods.wait(2);
    }

    @And("write a phone number")
    public void writeAPhoneNumber() {
        page.phonenumber.sendKeys("436453647");
        ReusableMethods.wait(2);
    }

    @And("write a login password")
    public void writeALoginPassword() {
        page.password1.sendKeys("710610");
        ReusableMethods.wait(2);
    }

    @And("write again login password")
    public void writeAgainLoginPassword() {
        page.password2.sendKeys("710610");
        ReusableMethods.wait(2);
    }

    @And("click the user conditions checkbox")
    public void clickTheUserConditionsCheckbox() {
        page.kullanimcheckbox.click();
        ReusableMethods.wait(2);
    }


    @When("login page click the uye ol button")
    public void loginPageClickTheUyeOlButton() {
        page.uyelikUyeOl.click();
        ReusableMethods.wait(2);
    }

    @And("click the kampanya checkbox")
    public void clickTheKampanyaCheckbox() {
        page.firsatcheckbox.click();
        ReusableMethods.wait(2);
    }

}
