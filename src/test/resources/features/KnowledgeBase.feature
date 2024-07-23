  @wip
  Feature: Compare the list titles on page 'Knowladge Base' in German and English.

    Background:
      Given I am on the Knowladge Page.
      And I click Accept Cookies Button.
      And I click Scroll button.

    Scenario:In German and English, the number of list headings on page 'Knowladge Base' is equal.

      When I save to a value the number of titles on the list.
      And I click on the language change button on the navbar.
      And I click Scroll button.
      Then I verify that the number of titles in the list is equal to the values I have recorded.


