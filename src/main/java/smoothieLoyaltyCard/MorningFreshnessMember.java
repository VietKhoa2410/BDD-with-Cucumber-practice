package smoothieLoyaltyCard;

public class MorningFreshnessMember {
  private String name;
  private SmoothieSchema schema;
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
