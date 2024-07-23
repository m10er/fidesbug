package utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {
    private  static WebDriver driver;
    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }

    //========Switching Window=====//

    //SwitchToWindow1
    public static void switchToWindow(int sayi){
        List<String> tumWindowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tumWindowHandles.get(sayi));
    }
    //SwitchToWindow2
    public static void window(int sayi){
        driver.switchTo().window(driver.getWindowHandles().toArray()[sayi].toString());
    }

    public static void sendKeys(WebElement webElement, String textToType){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(textToType);
    }
    public static void click(WebElement webElement){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    public static void hover(WebElement element) {
        waitForVisibility(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    //Click Method
    public static void clickWithJs1(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scrollWithJs(WebElement element) {
           waitForVisibility(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static WebElement waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickablility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void scrollToElementWithAction(WebElement element) {
        WebElement bottom = element;
        Actions actions = new Actions(driver);
        actions.scrollToElement(bottom).perform();
    }

    //HARD WAIT METHOD
    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
