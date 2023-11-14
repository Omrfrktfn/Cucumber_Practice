package cucumber_project.stepdefinitions;

import com.github.javafaker.Faker;
import cucumber_project.pages.Day01_Background_Page;
import cucumber_project.pages.Day02_SearchParameer_Page;
import cucumber_project.utilities.ConfigurationReader;
import cucumber_project.utilities.Driver;
import cucumber_project.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Day02_SearchParameter_StepDef {


    Day02_SearchParameer_Page page = new Day02_SearchParameer_Page();

    Faker faker = new Faker();
    String product = "";

    @Given("go to madame coco website")
    public void goToMadameCocoWebsite() {

        Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));
        ReusableMethods.wait(2);

    }

    @And("write searchbox vazo")
    public void writeSearchboxVazo() {

        page.searchBox.sendKeys("vazo", Keys.ENTER);
        ReusableMethods.wait(2);
    }

    @Then("the results confirm vazo")
    public void theResultsConfirmVazo() {

        page.verifyVazo.isDisplayed();
        ReusableMethods.wait(2);
        Driver.closeDriver();

    }

    @And("clikct the english button")
    public void clikctTheEnglishButton() {

        //  page.englishButton.click();
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.pz-body-w.index-wrapper > div.header-wrapper > div.header-band-top > div > div > div > form:nth-child(3) > button\")");
        ReusableMethods.wait(2);
    }

    @And("write searchbox{string}")
    public void writeSearchbox(String arg0) {

        String product = faker.commerce().productName();
        if (arg0.contains("<urun>")) {
            try {
                page.searchBox.sendKeys(product, Keys.ENTER);

            } catch (Exception e) {

            }
        }
    }

    @Then("the results confirm {string}")
    public void theResultsConfirm(String arg0) {

        assertTrue(page.sonuc.getText().contains(product));
        Driver.closeDriver();


    }
}
