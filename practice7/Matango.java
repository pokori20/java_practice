//フィールド宣言
public class Matango {
  //matangoの属性　初期レベル10
  int hp;
  //フィールド宣言の先頭にfinalを付けると値を書き換えられない定数フィールドになる
  final int LEVEL = 10; //定数フィールドは一目で分かるように大文字で書く
  //suffixは接尾辞(言葉のお尻に接続する言葉)
  char suffix;
  void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}