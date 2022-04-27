//ア. PoisonMatangoはMatangoクラスの中でも「毒攻撃」ができるもの。
//イ. PoisonMatangoは以下のコードでインスタンス化できる。
//PoisonMatango pm = new PoisonMatango('A');
public class PoisonMatango extends Matango {
  //ウ. PoisonMatangoは毒を用いて攻撃が可能で、攻撃が可能な残り回数をint型フィールドとしてもっており、初期値は5である。
  private int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix); // 引数1つの親クラスコンストラクタを呼び出す。
  }
  //PoisonMatangoはattack()メソッドが呼び出されると次の内容の攻撃をする。
  //1 まず、「通常のお化けキノコ同様の攻撃を行う」
  public void attack(Hero h) {
    super.attack(h);
  //2 「毒攻撃の残り回数」が0でなければ、以下を追加で行う。
  if (this.poisonCount > 0) {
  //3 画面に「さらに毒の胞子をばらまいた。」と表示。
      System.out.println("さらに毒の胞子をばらまいた");
  //4 勇者のHPの1/5に相当するポイントを勇者のHPから引き、そのポイントを示すように「～ポイントのダメージ」と表示する。
      int damage = h.getHp() / 5;
      h.setHp(h.getHp() - damage);
      System.out.println(damage + "ポイントのダメージを与えた！");
      //5 「毒攻撃の残り回数」を1減らす。
      this.poisonCount--;
    }
  }
}