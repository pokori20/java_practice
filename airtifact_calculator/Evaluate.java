public class Evaluate {
  public static double evaluate(double attack, double normalizedCritticalRate, double criticalDamage) {
    double airtifactScore = attack + normalizedCritticalRate + criticalDamage;
    return airtifactScore;
  }
}