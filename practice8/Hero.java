public class Hero {
  String name;
  int hp;
  static int money; //静的フィールド(static field)
  //通常、フィールドが格納される箱は個々のインスタンス(勇者)ごとに用意されますが、静的フィールドの箱はインスタンスではなく、
  //クラスに対して1つだけ用意されます。個々のmoenyではなく勇者全体のmoneyになる静的フィールドを読み書きする場合は Hero.money　のように書く。
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
  //コンストラクタのオーバーロード
  //Hero(引数)だと引数を必ず渡さねばエラーになるが、以下のように同名のメソッドを引数を指定しないで
  //追加することによりnameの引数がある場合とない場合を自動でjavaが判断して実行できる
  Hero() {
    this.hp = 100;
    this.name = "おまかせ勇者";
  }
}