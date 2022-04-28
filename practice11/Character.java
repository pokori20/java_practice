//高度な継承に関する2つの不都合について
//他の開発者がラクできるように心を砕くことを意識してCharacterクラスを開発していると2つの不都合が生じる。以下例１
public class Character {
  String name;
  int hp;
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= ??; //ここでダメージを何ポイント与えるか手が止まる。
    System.out.println("敵に??ポイントのダメージを与えた！");
    //今後このクラスを継承してMatangoを殴る勇者や魔法使いでは与えるダメージが異なるため、attackメソッドの内容を確定できない。
    //不都合パターンA 継承の材料となるクラスを作る時点では、その処理内容をまだ確定できていない「詳細未定メソッド」が存在する。
    //ではどのようにすればいいか?
  }
}