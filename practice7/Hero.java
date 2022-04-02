//手順1.中身のない空のヒーロークラスを作成
public class Hero {
  //手順2.属性の定義、名前とHPの宣言を追加
  String name;
  int hp;
  //手順3,操作の定義
  void sleep() {
    //this は「自分自身のインスタンス」を意味する
    //同じクラス内のフィールドアクセスの場合、this.を省略しても動作するが
    //ローカル変数や引数にも同じhpという変数が存在する場合、そちらが優先されるなどの
    //不測の事態を避けるため、this.は省略しない
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した。");
  }
  void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した。");
  }
  void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ");
  }
  void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}