//10章テスト3問目 以下のようなクラスがある。このクラスを利用してPoisonMatangoクラスを作成しろ
public class Matango {
  int hp = 50;
  private char suffix;
  public Matango(char suffix) {
    this.suffix = suffix;
  }
  public void attack(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println("10のダメージ");
    h.setHp(h.getHp() - 10);
  }
}