package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
    @Given("navigated to the Swag Labs URL")
    public void navigated_to_the_swag_labs_url() {
        System.out.println("navigated to the Swag Labs URL");
    }
    @When("enter a valid username {string} and password {string}")
    public void enter_a_valid_username_and_password(String username, String password) {
        System.out.println("enter a valid username"+username+" and password"+password);
    }
    @And("click the {string} button")
    public void click_the_button(String button) {
        System.out.println("click the "+button);
    }
    @And("click the add to Cart button on the product page")
    public void click_the_add_to_cart_button_on_the_product_page() {
        System.out.println("click the add to Cart button on the product page");
    }
    @Then("user should see the added product on the cart page")
    public void user_should_see_the_added_product_on_the_cart_page() {
        System.out.println("user should see the added product on the cart page");
    }
    @And("click the cart icon on the product page")
    public void click_the_cart_icon_on_the_product_page() {
        System.out.println("click the cart icon on the product page");
    }
    @Then("user should see the details of the product name,description and product price")
    public void user_should_see_the_details_of_the_product_name_description_and_product_price() {
       System.out.println("user should see the details of the product name,description and product price");
    }
    @And("click on the checkout button")
    public void click_on_the_checkout_button() {
        System.out.println("click on the checkout button");
    }
    @When("enter the first name {string},last name {string} and postal code {string} form")
    public void enter_the_first_name_last_name_and_postal_code_form(String first_name, String last_name, String postal_code) {
        System.out.println("enter the "+first_name+","+last_name+" and "+postal_code);
    }
    @And("click the continue button")
    public void click_the_continue_button() {
        System.out.println("click the continue button");
    }
    @Then("user will be redirected to the checkout overview page")
    public void user_will_be_redirected_to_the_checkout_overview_page() {
        System.out.println("user will be redirected to the checkout overview page");
    }
    @When("enter an invalid username {string} and password {string}")
    public void enter_an_invalid_username_and_password(String username, String password) {
        System.out.println("enter a valid username"+username+" and password"+password);
    }
    @Then("username and password do not match any user in this service is displayed")
    public void username_and_password_do_not_match_any_user_in_this_service_is_displayed() {
        System.out.println("username and password do not match any user in this service is displayed");
    }


    ////Hooks

    // Feature Hook
    @BeforeAll
    public static void beforeFeature() {
        System.out.println("BEFORE FEATURE");
    }
    @AfterAll
    public static void afterFeature() {
        System.out.println("AFTER FEATURE");
    }

    // Scenario Hooks
    @Before
    public void beforeScenario() {
        System.out.println("BEFORE SCENARIO");
    }
    @After
    public void afterScenario() {
        System.out.println("AFTER SCENARIO");
    }

    // Step Hooks
    @BeforeStep
    public void beforeEveryStep() {
        System.out.println("BEFORE STEP");
    }
    @AfterStep
    public void afterEveryStep() {
        System.out.println("AFTER STEP");
    }

}
