public class Hero {
  String name;
  int hp;
  Sword sword; //Sword型 勇者の装備している剣の情報
  void attack() {
    System.out.println(this.name + "は攻撃した");
    System.out.println("敵に5ポイントのダメージを与えた！");
  }
  //インスタンスが生まれた直後に自動実行されるようにHeroクラスのプログラムを組む
  Hero(String name) {
    this.hp = 100; //hpフィールドを100で初期化
    this.name = name;
    //newされた直後に自動的に実行される性質を持つメソッドをコンストラクタと呼ぶ
  }
}