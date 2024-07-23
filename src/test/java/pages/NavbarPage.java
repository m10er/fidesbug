package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavbarPage extends  BasePage{
    public NavbarPage(WebDriver driver) {
        super(driver);
    }

    // knowledge Base Link
    @FindBy(xpath = "//a[@href='https://fides.ch/knowledge-base/']")
    public WebElement knowladgeBaseLinkOnNavbar;

    public void clickKnowladgeBaseLinkOnNavbar() {
        click(knowladgeBaseLinkOnNavbar);
    }

    @FindBy(css = "[class='wpml-ls-display']")
    public List<WebElement> languageChange;

    public void clickLanguageChangeLinkOnNavbar() {
        for (WebElement language : languageChange) {
            if (language.isDisplayed()) {
                click(language);
                break;
            }
        }
    }

}
