//9-1カプセル化のメリット
//以下の分はアクセス制御されていないプログラムの例 Inn(宿屋)クラスの不具合でHeroのインスタンス化時にHP = -100になってしまう
public class Hero {
  //field
  int hp;
  String name;
  Sword sword;
  static int money;
  //method
  void bye {
    System.out.println("勇者は別れを告げた");
  }
  void die {
    System.out.println("this.name");
  }
  void sleep {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
  }
  void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
  }
  //反撃を受けてHPが2減る
  this.hp -= 2;
  if (this.hp <= 0) {
    this.die();
  }
}