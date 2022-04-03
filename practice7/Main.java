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
    //お化けキノコよ、この仮想世界に生まれよ！(マタンゴを2匹召喚)
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';
    //冒険の始まり
    yuusya.slip();
    m1.run();
    m2.run();
    yuusya.run();
    //勇者よ、戦え！
    //お化けキノコよ、逃げろ
  }
}