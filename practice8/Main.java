//クラス型と参照
public class Main {
  public static void main(String[] args) {
    Hero h1;
    h1 = new Hero();
    h1.hp = 100;
    //この時点ではh1の体力は100
    Hero h2;
    h2 = h1;
    h2.hp = 200;
    System.out.println("h1のhpは" + h1.hp);
    //8-2このプログラムを実行したとき出力されるh1.hpはいくつか？
    //9行目h2 = h1;でコピーしているのはh1の情報(h1.hp)ではなく、h1をが入っている箱の番地をコピーしている
    //すなわち11行のh1.hpが参照する先はh2.hpと同じになるため200が表示される
  }
}