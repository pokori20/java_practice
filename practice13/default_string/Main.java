//13-8 デフォルトの文字列表現
//以下の出力結果はどうなるか？
public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println(h.toString()); //引数は単にhでも可
  }
}
// 答え. Hero@2a139a55 なぜ"ミナト"や"100"ではなくこのような表示になるのか？
// HeroクラスではtoString()メソッドが宣言されていません。つまり、6行目で呼び出されて動作しているのは、Objectクラスに宣言され、Heroクラスに継承されてきたtoString()メソッドです。
//実際、Objectクラスに定義されているtoString()メソッドは、「型名@英数字」という形式で情報を表示するという極めてシンプルな処理内容になっています。