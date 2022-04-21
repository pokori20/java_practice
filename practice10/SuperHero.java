//10-2 クラス名をSuperHeroに書き換え
public class SuperHero {
  private String name = "ミナト";
  private int hp = 100;
  private boolean flying; //勇者は空を飛べるようになる
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた");
  }
  //逃げる
  public void run() {
    System.out.println(this.getName() + "は逃げ出した!");
  }
  //飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  //着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した!");
    //Q このように似たようなクラスをコピペするとどのような問題が生じるか？
    //A 例 Heroクラス内のメソッドを変更した場合、その変更をSuperHeroのコードも修正の必要がある。/重複したコードが多く、プログラム全体の見通しが悪くなる
  }
}