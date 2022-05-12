//13-9 文字列表現を定義する
//「print(h.String())」だけで「名前：ミナト/HP:100」みたいな表示をするにはどうするか？
public class Hero {
  String name;
  int hp;
  public String toString() { //この行でtoString()をオーバライドする
    return "名前:" + this.name + "/HP:" + this.hp;
  }
}