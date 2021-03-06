//10-1　似通ったクラスの開発
//戦うことと逃げることしかできない勇者クラス
public class Hero {
  private String name = "ミナト";
  private int hp = 100;
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた");
  }
  //逃げる （このクラスは子クラスでオーバライド可能）
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  //10-7 finalが付いているslip()メソッドは子クラスでオーバライド禁止
  public final void slip() {
    this.hp -= 5;
    System.out.println(this.getName() + "は転んだ！");
    System.out.println("5のダメージ");
  }
}