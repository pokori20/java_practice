//ヒーローやお化けキノコなどのインスタンスに指示を与えるクラス
public class Main {
  public static void main(String[] args) {
    //以下の内容をJavaで記述していく
    //1.勇者よ、この仮想世界に生まれよ！
    Hero yuusya = new Hero();
    //2.フィールドに初期値をセット
    yuusya.name = "ミナト";
    yuusya.hp = 100;
    System.out.println("勇者" + yuusya.name + "を生み出しました");
    //3.勇者のメソッドを呼び出してゆく
    //5秒座れ
    yuusya.sit(5);
    //転べ
    yuusya.slip();
    //座れ
    yuusya.sit(10);
    //逃げろ
    yuusya.run();
    //お化けキノコよ、この仮想世界に生まれよ！
    //Matango monster = new Matango();
    //勇者よ、戦え！
    //お化けキノコよ、逃げろ
  }
}