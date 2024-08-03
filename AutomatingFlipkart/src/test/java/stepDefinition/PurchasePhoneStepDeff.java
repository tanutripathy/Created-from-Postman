package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.PurchasePhonePage;
import utilities.ConstantUtils;

public class PurchasePhoneStepDeff extends WebConnector {

    PurchasePhonePage phonePage=new PurchasePhonePage();


    @Given("the user navigate to home page")
    public void the_user_navigate_to_home_page() {
      driver.get(ConstantUtils.BASE_URL);
    }

    @Then("the user click on search box")
    public void theUserClickOnSearchBox() {
        phonePage.clickOnSearchBox();

    }

    @And("type {string} in the search field")
    public void typeInTheSearchField(String text) {
        phonePage.EnterTextInSearchBox(text);
    }
}
