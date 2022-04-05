public class Wizard {
  String name;
  int hp;
  //引数でHero 型を指定
  void heal(Hero h) {
    h.hp = h.hp + 10;
    System.out.println(h.name + "のHPを10回復した");
  }
}