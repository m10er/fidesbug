package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Resources;
import utilities.TestData;

import java.util.List;

public class KnowledgeBase extends NavbarPage {
    public KnowledgeBase(WebDriver driver) {
        super(driver);
    }

    public void loadKnowledgePage() {
        driver.get(TestData.homePage+Resources.knowledgePage.path);
    }


    // dropdown-item
    @FindBy(className = "dropdown-item")
    public List<WebElement>  dropdownItemText;

    // Card Title
    @FindBy(xpath = "//div[@class='link']//div[@class='title']")
    public List<WebElement> cardTitleList;

    // More load Button
    @FindBy(css = "[class='button load-more-cards']")
    public List<WebElement> moreCardsButtons;

    @FindBy(css = "[class='h4']")
    public List<WebElement> titleTexts;




}