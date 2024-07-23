package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.KnowledgeBase;


public class KnowledgeBasePageSteps extends BaseStep {
    KnowledgeBase knowledgeBase = new KnowledgeBase(driver);
    int countTitleofList;

    @Given("I am on the Knowladge Page.")
    public void iAmOnTheKnowladgePage() {
        knowledgeBase.loadKnowledgePage();
    }

    @And("I click Scroll button.")
    public void iClickScrollButton() {
        knowledgeBase.clickScrollDownButton();
    }

    @When("I save to a value the number of titles on the list.")
    public void iSaveToAValueTheNumberOfTitlesOnTheList() {
        countTitleofList = knowledgeBase.dropdownItemText.size();
        System.out.println(countTitleofList);
    }

    @And("I click on the language change button on the navbar.")
    public void iClickOnTheLanguageChangeButtonOnTheNavbar() {
        knowledgeBase.clickLanguageChangeLinkOnNavbar();
    }

    @Then("I verify that the number of titles in the list is equal to the values I have recorded.")
    public void iVerifyThatTheNumberOfTitlesInTheListIsEqualToTheValuesIHaveRecorded() {
        int count = knowledgeBase.dropdownItemText.size();
        Assert.assertEquals(count, countTitleofList);
    }

    @And("I click Accept Cookies Button.")
    public void iClickAcceptCookiesButton() {
        knowledgeBase.clickAcceptCookies();
    }


}
