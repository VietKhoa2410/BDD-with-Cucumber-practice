package smoothieLoyaltyCard;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SmoothieLoyaltyCardScenarios {

  private SmoothieLoyaltyCardProgram smoothieLoyaltyCardProgram;
  private Integer result;

  @Given("Michael is a Morning Freshness Member")
  public void michael_is_a_Morning_Freshness_Member() {
    smoothieLoyaltyCardProgram = new SmoothieLoyaltyCardProgram();
  }

  @When("Michael purchases {int} Banana drinks")
  public void michael_purchases_Banana_drinks(Integer int1) {
    result = smoothieLoyaltyCardProgram.purchaseRegularDrink(int1);
  }

  @Then("He should receive {int} points")
  public void he_should_receive_points(Integer int1) {
    Assert.assertEquals(int1, result);
  }

  @When("Michael purchases {int} Triple Berry Blend drinks")
  public void michael_purchases_Triple_Berry_Blend_drinks(Integer int1) {
    result = smoothieLoyaltyCardProgram.purchaseFancyDrink(int1);
  }

  @When("Michael purchases {int} Earl Grey drinks")
  public void michael_purchases_Earl_Grey_drinks(Integer int1) {
    result = smoothieLoyaltyCardProgram.purchaseTeaDrink(int1);
  }

}
