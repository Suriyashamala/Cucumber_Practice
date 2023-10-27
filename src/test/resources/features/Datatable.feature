Feature:Swag Labs checkout step functionality
  As a user,I want to verify checkout functionality;
  so that I can log in as default username "standard_user" and password "secret_sauce"

Scenario Outline:Verify that users can log in with valid credentials
Given navigated to the Swag Labs URL
When enter a valid username '<username>' and password '<password>'
And click the "login" button
And click the add to Cart button on the product page
Then user should see the added product on the cart page
And click the cart icon on the product page
Then user should see the details of the product name,description and product price
And click on the checkout button
When enter the first name "first name",last name "last name" and postal code "postal code" form
And click the continue button
Then user will be redirected to the checkout overview page

Examples:
|   username    |   password    |
| standard_user |  secret_sauce |
| standard_user |   Reshamala   |