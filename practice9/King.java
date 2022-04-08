public class King {
  void talk(Hero h) {
    System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ");
    System.out.println("王様：長旅で疲れただろう。");
    System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう");
    h.die(); //本当はbye();を呼び出すはずが間違えて勇者が倒れてしまうメソッドを呼び出し
  }
}