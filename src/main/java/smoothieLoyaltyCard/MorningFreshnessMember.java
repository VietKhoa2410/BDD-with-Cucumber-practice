package smoothieLoyaltyCard;

public class MorningFreshnessMember {
  private final String name;
  private final SmoothieSchema schema;
  private int points;

  public MorningFreshnessMember(String username, SmoothieSchema schema) {
    this.name = username;
    this.schema = schema;
  }

  public Integer getPoints() {
    return points;
  }

  public void order(Integer amount, String drink) {
    points +=
        schema.getPoints(drink)*amount;
  }

}
