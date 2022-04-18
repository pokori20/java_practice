//宿屋クラス
public class Inn {
  void checkIn(Hero h) {
    h.hp = -100; //タイプミスが原因でHeroクラスの勇者のHPの不具合の原因になっている
    //→対策として、Heroクラス以外からはhpフィールドに値を設定できないようにすればよい
  }
}