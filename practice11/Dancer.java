//オーバライドし忘れの解決策
public class Dancer extends Character {
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った");
  }
  //このクラスをコンパイルしようとすると、「未完成のクラスであるDancerはabstractを付けて抽象クラスにしなければならない」という意味のエラーメッセージが表示される。
  //解決策として以下のように継承元クラスの未完成部分を完成させてなくすようにする。
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージを与えた");
    m.hp -= 3
  }
}