package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.Keys;

public class PurchasePhonePage extends WebConnector {


    /************************LOCATORS********************************/
    private String searchBoxXpath="/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input";



    /***************************GETTERS&SETTERS**********************/

    public void clickOnSearchBox(){
        BasePage.findElementByXpath(10,searchBoxXpath).click();
    }

    public void EnterTextInSearchBox(String product){
        BasePage.findElementByXpath(10,searchBoxXpath).sendKeys(product);
        BasePage.findElementByXpath(10,searchBoxXpath).sendKeys(Keys.ARROW_DOWN);
        BasePage.findElementByXpath(10,searchBoxXpath).sendKeys(Keys.ENTER);
    }
}
