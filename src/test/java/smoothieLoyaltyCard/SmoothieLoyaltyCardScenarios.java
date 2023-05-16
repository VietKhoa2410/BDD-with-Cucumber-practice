package smoothieLoyaltyCard;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.List;
import java.util.Map;
import org.junit.Assert;

public class SmoothieLoyaltyCardScenarios {

  private DrinkCatalog drinkCatalog ;
  private SmoothieSchema smoothieSchema ;
  private MorningFreshnessMember member;

  @Given("the following drink categories:")
  public void the_following_drink_categories(List<Map<String, String>> drinkCategories) {
    drinkCatalog = new DrinkCatalog();
    smoothieSchema = new SmoothieSchema(drinkCatalog);

    drinkCategories.forEach(
        drinkCategory -> {
          String drink = drinkCategory.get("Drink");
          String category = drinkCategory.get("Category");
          Integer points = Integer.parseInt(drinkCategory.get("Points"));

          drinkCatalog.add(drink, category);
          smoothieSchema.setCategoryPoints(category, points);
        }
    );
  }

  @Given("{} is a Morning Freshness Member")
  public void michael_is_a_Morning_Freshness_Member(String username) {
    member = new MorningFreshnessMember(username, smoothieSchema);
  }

  @When("{} purchases {int} {} drinks")
  public void michael_purchases_Banana_drinks(String username, Integer amount, String drink) {
    member.order(amount, drink);
  }

  @Then("He should receive {int} points")
  public void he_should_receive_points(Integer int1) {
    Assert.assertEquals(int1, member.getPoints());
  }
}
