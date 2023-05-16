package smoothieLoyaltyCard;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {
  private final Map<String, String> catalog = new HashMap<>();

  public void add(String drink, String category){
    catalog.put(drink, category);
  }

  public String getCatalog(String drink) {
    return catalog.get(drink);
  }
}
