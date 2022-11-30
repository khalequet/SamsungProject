package pageObject;
import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class createaccount_page extends Config {


    public createaccount_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // Locators

//    @FindBy(how = How.ID, using = "bx-form-1588760-step-1")
//    public WebElement popupcancelLocator;


    @FindBy(how = How.XPATH, using = "//a[@aria-label='Sign in']")
    public WebElement accounticonLocator;

    @FindBy(how = How.XPATH, using = "//a[@class='gnb__utility-link loginBtn']")
    public WebElement createaccountLocator;

    @FindBy(how=How.XPATH, using = "//a[@data-ng-click='signUp()']")
    public WebElement AccountLocator;

    @FindBy(how = How.XPATH, using = "//button[@class='one-primary one-button']")
    public WebElement agreeLocator;

    @FindBy (how=How.XPATH,using = "//input[@type='email']")
    public WebElement emailLocator;

    @FindBy (how = How.XPATH, using = "//input[@data-ng-model='vm.password']")
    public WebElement passwordLocator;

    @FindBy (how= How.XPATH, using = "//input[@id='confirmPassword']")
    public WebElement confirmpasswordLocator;

    @FindBy (how=How.XPATH, using = "//input[@id='givenName1']")
    public WebElement firstnameLocator;

    @FindBy (how=How.XPATH, using = "//input[@id='familyName1']")
    public WebElement lastnameLocator;

    @FindBy (how=How.ID, using = "month2")
    public WebElement monthLocator;
    @FindBy (how=How.XPATH, using = "//input[@id='day']")
    public WebElement dayLocator;
    @FindBy (how=How.XPATH, using = "//input[@id='year']")
    public WebElement yearLocator;
    @FindBy (how=How.XPATH, using = "//input[@id='adrHomePostalCode']")
    public WebElement zipcodeLocator;

//    @FindBy (how=How.ID, using = "submitForCaptcha")
//    public WebElement nextbuttonLocator;

    @FindBy (how = How.XPATH, using = "//button[@id='submitForCaptcha']")
    public WebElement nextbuttonLocator;


    // Functions

    public void verifySamsunhomepageTitle(){
        String act = driver.getTitle();
        String exp = "Samsung US | Mobile | TV | Home Electronics | Home Appliances | Samsung US";
        Assert.assertEquals(exp, act);
        System.out.println("I am in Samsung home page ");
    }

//    public void clicktocancelpopup(){
//        popupcancelLocator.click();
//    }

    public void clickaccounticon(){
       accounticonLocator.click();
    }

    public void clickoncreateaccount(){
        createaccountLocator.click();
    }

    public void iclickAccountforSamSung(){
        AccountLocator.click();
    }

    public void iclickonAgreeButton(){
        agreeLocator.click();
    }

    public void enterEmail(String email){
        emailLocator.sendKeys(email);
    }

    public void enterPassword(){
        passwordLocator.sendKeys("Candy19Cat!");
    }

    public void enterConfirmPassword(){
        confirmpasswordLocator.sendKeys("Candy19Cat!");
    }

    public void enterfirstname(String fname){
        firstnameLocator.sendKeys(fname);
    }
    public void enterlastname(String lname){
        lastnameLocator.sendKeys(lname);
    }
    public void selectMonth(){
       monthLocator.click();
    }
    public void enterDay(){
        dayLocator.sendKeys("12");
    }
    public void enterYear(){
        yearLocator.sendKeys("1994");
    }
    public void enterZipcode(){
        zipcodeLocator.sendKeys("10462");
    }
    public void clickNextButton() {
        nextbuttonLocator.click();
    }


    public void dragtheslider() {
        WebElement slider = driver.findElement(By.xpath("//i[@class='sliderIcon']"));
        Actions actions = new Actions(driver);
      //  actions.dragAndDropBy(slider,,40).perform();


    }



















    // ---> Reentering the info to signup

    public void reenterEmail(String email1){
        emailLocator.sendKeys(email1);
    }

    public void reenterPassword(){
        passwordLocator.sendKeys("Candy19Cat!");
    }

    public void renterConfirmPassword(){
        confirmpasswordLocator.sendKeys("Candy19Cat!");
    }

    public void reenterfirstname(String fname){
        firstnameLocator.sendKeys(fname);
    }
    public void reenterlastname(String lname){
        lastnameLocator.sendKeys(lname);
    }
    public void reselectMonth(){
        monthLocator.click();
    }
    public void reenterDay(){
        dayLocator.sendKeys("12");
    }
    public void reenterYear(){
        yearLocator.sendKeys("1994");
    }
    public void reenterZipcode(){
        zipcodeLocator.sendKeys("10462");
    }
    public void reclickNextButton() {
        nextbuttonLocator.click();
    }












}
