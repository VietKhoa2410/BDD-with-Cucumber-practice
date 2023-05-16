package smoothieLoyaltyCard;

import java.util.HashMap;
import java.util.Map;

public class SmoothieSchema {
  private final Map<String, Integer> categoryPoints;
  private final DrinkCatalog drinkCatalog ;

  public SmoothieSchema(DrinkCatalog drinkCatalog) {
    categoryPoints  = new HashMap<>();
    this.drinkCatalog = drinkCatalog;
  }

  public void setCategoryPoints(String category, Integer points) {
    categoryPoints.put(category, points);
  }

  public Integer getPoints(String drink) {
    return categoryPoints.get(categoryOf(drink));
  }

  private String categoryOf(String drink) {
    return drinkCatalog.getCatalog(drink);
  }
}
