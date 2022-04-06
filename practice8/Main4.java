public class Main4 {
  public static void main(String[] args) {
    Hero h = new Hero("ミナト");
    //自動でhpに初期値が入っているか確認
    System.out.println(h.hp);
    System.out.println(h.name);
    //このように書けば毎回Mainで初期値をセットしなくてよい

    Hero h2 = new Hero();
    System.out.println(h2.hp);
    System.out.println(h2.name);
  }
}