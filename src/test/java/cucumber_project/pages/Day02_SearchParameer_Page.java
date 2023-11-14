package cucumber_project.pages;

import cucumber_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day02_SearchParameer_Page {

    public Day02_SearchParameer_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    };

    @FindBy(id = "pz-form-input-AutocompleteInput")
    public WebElement searchBox;

    @FindBy(xpath = "//span[normalize-space()='\"vazo\"']")
    public WebElement verifyVazo;


    @FindBy (xpath= "(//button[@class='action-menu__button -active'])[1]")
    public WebElement englishButton;
    @FindBy (xpath= "//img[@class='mfp-close wis-mfp-close-244800']")
    public WebElement reklam;
    @FindBy (xpath= "//button[@class='cc-nb-reject']")
    public WebElement coocies;
    @FindBy (xpath= " (//img[@src='https://dbfukofby5ycr.cloudfront.net/m13/1/1657/d2304/1f5ba-c--k--s---konu.png'])[1]")
    public WebElement miniReklam;
    @FindBy (xpath= " //div[@class='searched-text']")
    public WebElement sonuc;


}
