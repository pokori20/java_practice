public class Main4 {
  public static void main(String[] args) {
    Hero h = new Hero("ミナト");
    Hero.money = 100;
    System.out.println(Hero.money);
    System.out.println(h.money);
    h.money = 300;
    
    //自動でhpに初期値が入っているか確認
    System.out.println(h.hp);
    System.out.println(h.name);
    //このように書けば毎回Mainで初期値をセットしなくてよい

    Hero h2 = new Hero();
    System.out.println(h2.hp);
    System.out.println(h2.name);
    //クラス Hero の箱のmoneyを表示
    System.out.println(h2.money);
  }
}