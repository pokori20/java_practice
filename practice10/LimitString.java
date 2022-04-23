//10-7 継承やオーバライドの禁止
public class LimitString extends String {
  //String クラスを継承しようとするとコンパイルエラーが出る。原因はJavaのAPIリファレンスを見ると、Stringクラスは次のように宣言されていることが分かります。
  public final class String extends object ...
  //Javaでは、宣言時にfinalが付けられているクラスは継承できない。
  //理由：他のクラスでも多用されるStringクラスが容易に書き換えられるとバグの温床になるため、finalがついているメソッドはオーバライドできない。
}