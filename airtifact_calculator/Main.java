public class Main {
  public static void main(String[] args) {
    System.out.println("聖遺物のスコア(攻撃力)の合計を入力してください。");
    double attack = new java.util.Scanner(System.in).nextInt();

    System.out.println("聖遺物のスコア(会心率)の合計を入力してください。");
    double criticalRate = new java.util.Scanner(System.in).nextInt();
    double normalizedCritticalRate = normalize(criticalRate);

    System.out.println("聖遺物のスコア(会心ダメージ)の合計を入力してください。");
    double criticalDamage = new java.util.Scanner(System.in).nextInt();

    // 総評　例) 聖遺物の合計スコアは168です。厳選は終期です。他のキャラクターを育成しましょう！
    double airtifactScore = Evaluate.evaluate(attack, normalizedCritticalRate, criticalDamage);
    if (airtifactScore < 135) {
       System.out.println("あなたの聖遺物スコアは" + airtifactScore + "です。 厳選の道のりは長いです。頑張って厳選していきましょう！");
    } else if (airtifactScore >= 160) {
       System.out.println("あなたの聖遺物スコアは" + airtifactScore + "です。 厳選は終期です。他のキャラクターを育成しましょう！");
    } else {
       System.out.println("あなたの聖遺物スコアは" + airtifactScore + "です。 キャラクターの性能を十分に発揮できます。厳選を終えてもよいでしょう！");
    }

  }
  public static double normalize(double criticalRate) {
    if (criticalRate <= 100){
      double normalizedCritticalRate = 2 * criticalRate;
      return normalizedCritticalRate;
    } else {
      double normalizedCritticalRate = 2 * 100;
      return normalizedCritticalRate;
    }
  }

}