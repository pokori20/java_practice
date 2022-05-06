public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard();
    //Character型の箱に代入
    Character c = w;
    Matango m = new Matango();
    c.name = "アサカ";
    c.attack(m);
    c.fireball(m); //この行でエラーが発生する
    //Wizardクラスでfireballメソッドを定義しているが、Characterの型に代入した際にWizardであることを忘れてしまっている
    //コンパイラに変数cの中身を強制的に「Wizardとしてとらえなおしたい」場合には以下のように書く。
    // Wizard w = (Wizard) c; このようにキャスト演算子を用いれば曖昧なCharacter型にWizard型の変数を代入できる。
  }
}