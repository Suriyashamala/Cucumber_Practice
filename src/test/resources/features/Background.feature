Feature:Swag Labs checkout step functionality
  As a user,I want to verify checkout functionality;
  so that I can log in as default username "standard_user" and password "secret_sauce"

  Background:
    Given navigated to the Swag Labs URL

  Scenario: Verify that users can log in with valid credentials
#    Given navigated to the Swag Labs URL
    When enter a valid username "standard_user" and password "secret_sauce"
    And click the "login " button
    And click the add to Cart button on the product page
    Then user should see the added product on the cart page
    And click the cart icon on the product page
    Then user should see the details of the product name,description and product price
    And click on the checkout button
    When enter the first name "Sham",last name "Resh" and postal code "Cuddalore" form
    And click the continue button
    Then user will be redirected to the checkout overview page

  Scenario: Verify that users can log in with invalid credentials
#    Given navigated to the Swag Labs URL
    When enter an invalid username "standard_user" and password "Reshamala"
    And click the "login" button
    Then username and password do not match any user in this service is displayed