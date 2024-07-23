package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;
import utilities.TestData;

import java.util.List;

public class BasePage extends ReusableMethods {
    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void loadHomePage() {
        driver.get(TestData.homePage);
    }


    // scroll down
    @FindBy(id = "scroll-down")
    public WebElement scrollDownButton;

    public void clickScrollDownButton(){
        click(scrollDownButton);
    }

    // coockie
    @FindBy(xpath = "//*[@class='ot-btn-container']//button")
    public List<WebElement> cookiesButton;

    public void clickAcceptCookies(){
        click(cookiesButton.get(1));
    }

    public void clickRejectCookies(){
        click(cookiesButton.get(0));
    }



}
