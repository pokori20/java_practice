public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    Matango m = new Matango();
    h.attack(m); //メソッドは呼び出せるがHeroクラスでオーバライドをし忘れると「呼び出せるが、何も起きない」という不具合が生じる。
  }
  //不都合パターン3
  public static void main(String[] args) {
    Character c = new Character(); //Characterクラスを継承するはずが、誤ってHeroやWizardのようにnewして使われてしまっている。
    Matango m = new Matango('A');
    c.attack(m);
  }
}