//9章テスト1 Clericクラスの各インスタンスが同じ情報を持つのを防ぐため、フィールド宣言に適切なキーワードを追加してください
//Randomを使用できるようするためjava utilityをimport
import java.util.*;

public class Cleric {
  static final int MaxHp = 50;
  static final int MaxMp = 10;
//A. new Cleric("アサカ, 40.5")のように、名前、HP、MPを指定してインスタンス化を実行
  public Cleric(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp; 
  }
  //new Cleric("アサカ, 40.5")のように、名前、HPを指定してインスタンス化を実行
  //コンストラクタ9行目を呼び出す
  public Cleric(String name, int hp) {
    this(name, hp, Cleric.MaxMp);
  }
  //new Cleric("アサカ")のように、名前を指定してインスタンス化を実行
  public Cleric(String name) {
    this(name, MaxHp, Cleric.MaxMp);
  }
}
