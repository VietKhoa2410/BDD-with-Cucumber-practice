package calculator;

import calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculatorStepDefinitions {
  Calculator calculator;
  Integer result;

  @Given("I have a calculator")
  public void i_have_a_calculator() {
    calculator = new Calculator();
  }

  @When("I add {int} and {int}")
  public void i_add_and(Integer int1, Integer int2) {
    result = calculator.add(int1, int2);
  }

  @Then("I should get {int}")
  public void i_should_get(Integer expectedResult) {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals(expectedResult, result);
  }
}
