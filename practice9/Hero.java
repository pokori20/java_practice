//9-1カプセル化のメリット
//以下の分はアクセス制御されていないプログラムの例 Inn(宿屋)クラスの不具合でHeroのインスタンス化時にHP = -100になってしまう
public class Hero {
  //field
  private int hp; // 9-4 アクセス修飾子を記述してアクセスの許可範囲をHeroクラス内に限定 checkInn()メソッドは「HPフィールドにアクセスできません」というコンパイルエラーがでるためミスに気づくことができます
  private String name; //nameはprivate指定されているため、KingクラスのHero hメソッドで呼び出せないので新たにgetNameメソッドを追加する
  Sword sword;
  static int money;
  //method
  void bye() {
    System.out.println("勇者は別れを告げた");
  }
  // 9-5 dieメソッドはHeroクラスのみで使用するため、みだりに呼び出されないようにprivate設定
  private void die() {
    System.out.println("this.name");
  }
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
  }
  //9-6 attackメソッドはいろいろなクラスから呼び出す可能性があるため、public指定する
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
      //反撃を受けてHPが2減る
  this.hp -= 2;
  if (this.hp <= 0) {
    this.die();
    }
  }

  // 他クラスから呼び出し用getNameメソッドを定義 このような特定のフィールドの中身を取り出すメソッドをgetterメソッドと呼ぶ public 型 getフィールド名(){ return this.フィールド名; }
  public String getName() {
    return this.name;
  }
  //9-10 setterメソッドの例 getterメソッドとは逆に、ある特定のフィールドに指定された値を単に代入するだけのメソッドをsetterメソッドと呼ぶ
  public void setName(String name) {
    //10-13 setterメソッドの中で値の妥当性をチェックする。他のクラスから呼び出すときに値が妥当でないときにエラーメッセージを出力できる。
    if (name == null) { 
      throw new IlleagalArgumentException("名前がnullであるため、処理を中断。"); //throwオプション：JVM君に例外処理をスロー（投げる）
    }
    if (name.length() <= 1) {
      throw new IlleagalArgumentException("名前が短すぎる。処理を中断。");
    }
    if (name.length() >= 8) {
      throw new IlleagalArgumentException("名前が長すぎる。処理を中断。");
    }
    this.name = name; //thisは必須　同じクラス内なのでnameでも呼び出せるがローカル変数や引数に同じnameという名前の変数がある場合にそちらが優先されるのを防ぐ
    //メリット1: getterとsetterメソッドを使うことでRead only と Write only にするテクニックとして用いられます。
    //メリット2: フィールドの名前等がなんらかの理由で変更の必要が出た際にgetterやsetterを使用しなかった場合他のクラスから直接呼び出している他の開発者にアクセスするフィールド名を変更してもらう必要がある
    //getterやsetterを用いることでそのメソッド内の変数のみを変えればよい
  }
}