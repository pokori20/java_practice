//高度な継承に関する2つの不都合について
//他の開発者がラクできるように心を砕くことを意識してCharacterクラスを開発していると2つの不都合が生じる。以下例１
//11-8 未完成部分を含む継承専用のクラスを誤ってnewされる可能性を防ぐためにclass宣言前にabstractを付ける
public class Character {
// public abstract void attack(Matango m); 抽象クラスとしてCharacterクラスを宣言
// Javaでは未完成部分を含むクラスを宣言するときは、abstractを付きで宣言する。付与することでnewによるインスタンス化が禁止される
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
  //11-7 詳細未定メソッドの宣言
  //空のメソッドを作っておくと、「現時点で処理内容を確定できないメソッド」なのか「何もしないメソッド」を区別できないので
  //アクセス修飾子 abstract 戻り値 メソッド名(引数リスト); と書く。これで第2の心配事は解決できる。
  public abstract void attack(Matango m);
  //abstractとは「抽象的・あいまいな」という意味の英単語です。これをattack()メソッドの宣言に付けることで、必要な宣言ではあるが、内容は不確定なため、メソッド内の処理は行わないという意味を持たせる。
}