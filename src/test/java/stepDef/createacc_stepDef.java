package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObject.createaccount_page;

import java.util.stream.DoubleStream;

public class createacc_stepDef extends Config {

    createaccount_page CP = new createaccount_page(driver);
    Faker faker = new Faker();

    @Given("i am at Samsung Home page")
    public void iAmAtSamsungHomePage() {
        CP.verifySamsunhomepageTitle();
    }

//    @And("i cancel the popup")
//    public void iCancelThePopup() {
//        CP.clicktocancelpopup();
//    }
    @And("i click on Create account icon")
    public void iClickOnCreateAccountIcon() {
        CP.clickaccounticon();
    }



    @And("i click on Create account button")
    public void iClickOnCreateAccountButton() {
        CP.clickoncreateaccount();
    }

    @And("i click on create account on the Samsung Account page")
    public void iClickOnCreateAccountOnTheSamsungAccountPage() {
        CP.iclickAccountforSamSung();
    }

    @And("i click on Agree button")
    public void iClickOnAgreeButton() {
        CP.iclickonAgreeButton();
    }

    @And("i enter valid email address")
    public void iEnterValidEmailAddress() {
        String firstname = faker.name().firstName().toLowerCase();
        String lastname = faker.name().lastName().toLowerCase();
        String domain = "@gmail.com";
        String email = firstname+lastname+domain;
        CP.enterEmail(email);
    }

    @And("i enter valid password")
    public void iEnterValidPassword() {
        CP.enterPassword();

//        String fakeFirstName = faker.name().firstName().toLowerCase();
//        String fakeLastname = faker.name().lastName().toLowerCase();
//        String fakeRandomNumber = faker.number().digits(2);
//        String password = fakeFirstName+fakeLastname+fakeRandomNumber;
//        CP.enterPassword(password);
//        CP.enterConfirmPassword();
    }

    @And("i enter valid confirm password")
    public void iEnterValidConfirmPassword() {
        CP.enterConfirmPassword();

    }
    @And("i enter valid first name")
    public void iEnterValidFirstName() {
        String firstname = faker.name().firstName();
        CP.enterfirstname(firstname);
    }

    @And("i enter valid last name")
    public void iEnterValidLastName() {
        String lastname = faker.name().lastName();
        CP.enterlastname(lastname);
    }

    @And("i select birthday month")
    public void iSelectBirthdayMonth() {
        CP.selectMonth();
    }

    @And("i enter birthday day")
    public void iEnterBirthdayDay() {
        CP.enterDay();
    }


    @And("i enter birthday year")
    public void iEnterBirthdayYear() {
        CP.enterYear();
    }

    @And("i enter zipcode")
    public void iEnterZipcode() {
        CP.enterZipcode();
    }

    @When("i click on Next button")
    public void iClickOnNextButton() {
        CP.clickNextButton();
    }

    @When("i drag the slider")
    public void iDragTheSlider() { //---> for slider
        CP.dragtheslider();
    }





















        // --Recalling the function again for verification
    @Then("i reenter valid email address")
    public void iReenterValidEmailAddress() {
        String firstname = faker.name().firstName().toLowerCase();
        String lastname = faker.name().lastName().toLowerCase();
        String domain = "@gmail.com";
        String email = firstname+lastname+domain;
        CP.reenterEmail(email);
    }

    @And("i reenter valid password")
    public void iReenterValidPassword() {
    }

    @And("i reenter valid confirm password")
    public void iReenterValidConfirmPassword() {
    }

    @And("i reenter valid first name")
    public void iReenterValidFirstName() {
    }

    @And("i reenter valid last name")
    public void iReenterValidLastName() {
    }

    @And("i reselect birthday month")
    public void iReselectBirthdayMonth() {
    }

    @And("i reenter birthday day")
    public void iReenterBirthdayDay() {
    }

    @And("i reenter birthday year")
    public void iReenterBirthdayYear() {
    }

    @And("i reenter zipcode")
    public void iReenterZipcode() {
    }

    @And("i reclick on Next button")
    public void iReclickOnNextButton() {
    }
}
