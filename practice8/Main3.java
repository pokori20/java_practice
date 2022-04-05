//クラス型メソッド引数や戻り値に用いる
public class Main3 {
  public static void main(String[] args) {
    Hero h1 = new Hero(); //9-2左のようにインスタンスを生成して
    h1.name = "ミナト"; //初期値をセットするのを繰り返すのはめんどくさい
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 100;
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    //引数を与えてhealする対象を指定
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}