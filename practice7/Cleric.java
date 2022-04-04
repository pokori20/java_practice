//Randomを使用できるようするためjava utilityをimport
import java.util.*;
//8-1聖職者(Cleric)をpublicで宣言
public class Cleric {
  //8-2 名前、HP、最大HP、MP、最大MPを属性として追加.なお最大HPとMPは定数フィールドで宣言
  String name;
  int hp = 50;
  int mp = 10;
  final int MaxHp = 50;
  final int MaxMp = 10;

  //8-3 魔法「セルフエイド」を使えるようにする mp消費5体力全回復
  public void selfAid() {
    System.out.println("魔法使いはセルフエイドを唱えた");
    this.mp = this.mp - 5;
    this.hp = this.MaxHp;
    System.out.println("魔法使いは体力を全回復した");
  }
  //8-4 祈る(pray)という行動を定義せよ　自分のMPを祈った秒数+ランダムで0~2回復　ただし最大MPを超えないこと
  //戻り値がint型のためvoidではなくint
  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間祈った");
    //理論回復量
    int num = new Random().nextInt(3) + sec;
    //実際の回復量
    //Math.minは2つの引数のうち、どちらか小さいほうの値を取得する
    //以下のように書くことで最大MPを溢れる場合のみMPの差分を回復できる
    int recoverActual = Math.min(this.MaxMp - this.mp, num);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}
