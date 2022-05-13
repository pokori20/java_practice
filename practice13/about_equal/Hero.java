// 14-11  equals()メソッドのオーバーライドでHeroクラスは「名前が同じであれば同じ内容のインスタンスとみなす」と定義した場合
public class Hero {
  String name;
  int hp;
  public boolean equals(Object o) {
    if (this == o) { return true; } //等値なら等価
    if (o instanceof Hero) {
      Hero h = (Hero) o;
      if (this.name.equals(h.name)) { //名前が同じなら等価
        return true;
      }
    }
    return false;
  }
}