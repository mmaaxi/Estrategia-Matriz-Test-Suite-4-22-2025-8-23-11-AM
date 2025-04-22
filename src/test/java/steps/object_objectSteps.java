package steps;

import pages.object_objectPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class object_objectSteps {

    object_objectPage objectPage = new object_objectPage();

    @Given("I do action object Object")
    public void i_do_action_object_Object() {
        objectPage.performFirstAction();
    }

    @Then("I should see object Object")
    public void i_should_see_object_Object() {
        objectPage.verifyFirstResult();
    }

    @When("I perform object Object")
    public void i_perform_object_Object() {
        objectPage.performSecondAction();
    }

    @Then("I check object Object")
    public void i_check_object_Object() {
        objectPage.verifySecondResult();
    }

    @When("I execute object Object")
    public void i_execute_object_Object() {
        objectPage.performThirdAction();
    }

    @Then("I expect to find object Object")
    public void i_expect_to_find_object_Object() {
        objectPage.verifyThirdResult();
    }

    @When("I proceed with object Object")
    public void i_proceed_with_object_Object() {
        objectPage.performFourthAction();
    }

    @Then("I verify object Object")
    public void i_verify_object_Object() {
        objectPage.verifyFourthResult();
    }

    @When("I trigger object Object")
    public void i_trigger_object_Object() {
        objectPage.performFifthAction();
    }

    @Then("I confirm object Object")
    public void i_confirm_object_Object() {
        objectPage.verifyFifthResult();
    }
}