public class King {
  void talk(Hero h) {
    System.out.println("王様：ようこそ我が国へ、勇者" + h.GetName + "よ"); //9-9 Heroクラスのフィールドをprivate設定したため、h.name を h.getName に修正
    System.out.println("王様：長旅で疲れただろう。");
    System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう");
    //h.die();    //本当はbye();を呼び出すはずが間違えて勇者が倒れてしまうメソッドを呼び出し
    // die()メソッドを呼び出せるのはHeroクラスだけ
  }
}