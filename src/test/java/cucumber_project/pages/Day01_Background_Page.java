package cucumber_project.pages;

import cucumber_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day01_Background_Page {

    public Day01_Background_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='dropbtn nothidden']")
    public WebElement loginandWait;
    @FindBy (xpath = "//button[@data-target='#modalSignIn']")
    public WebElement login;
    @FindBy (id = "tb-contactEmailSignIn")
    public WebElement email;
    @FindBy (id = "showPass_2")
    public WebElement password;
    @FindBy (id = "btn-signin")
    public WebElement clicklogin;
    @FindBy (xpath = "//button[@data-target='#modalSignUp']")
    public WebElement uyeOl;
    @FindBy (id = "tb-signUp-firstName")
    public WebElement name;
    @FindBy (id = "tb-signUp-lastName")
    public WebElement surname;
    @FindBy (id = "tb-contactEmailSignUp")
    public WebElement eposta;
    @FindBy (id = "contactFormPhoneNumber")
    public WebElement phonenumber;
    @FindBy (id = "showPass_0")
    public WebElement password1;
    @FindBy (id = "showPass_1")
    public WebElement password2;
    @FindBy (xpath = "//a[@class='agreement-usage']/preceding-sibling::span[@class='span-for-checkbox']")
    public WebElement kullanimcheckbox;
    @FindBy (xpath = "//label[@for='cb-dealCampaign']")
    public WebElement firsatcheckbox;
    @FindBy (id = "btn-signup")
    public WebElement uyelikUyeOl;


}
