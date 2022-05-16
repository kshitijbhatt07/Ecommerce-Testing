Feature: feature to test buying funcionlaity

  Scenario: Check Hompage is displayed
    Given user enter the webite URL
    When user is on homepage
    Then user is displayed home page and its contents
    And scroll is enabled

  Scenario: Check that the user is able to navigate through the categories
    When user is on homepage
    Then user can navigate to different categories displayed
    And view the list of products

  Scenario: Check that the user is able to view the product details
    When user is on category page
    Then user clicks on product
    And view the product description

  Scenario: Check that the user is able to add selected product in the cart
    When user is product description page
    And user clicks on add to cart
    Then product is added to cart

  Scenario: Check checkout functionality
    When user clicks on cart
    Then user is navigated to cart page
    And check delete funtionality of cart
    When user clicks place order
    Then verify form is displayed and correct information is entered
    When user clicks on purchase
    Then checkout confirmation is displayed with necessary details
