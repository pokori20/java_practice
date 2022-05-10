//14-5 暗黙の継承
public class Main {
  public static void main(String[] args) {
    Empty e = new Empty(); //Emptyクラスではフィールドもメソッドも定義されていない
    String s = e.toString(); //Date型を文字列に変換　例　Sun Aug 07 16:38:59 JST 2011
    System.out.println(s);
    //一見するとエラーが発生するように見えるがコンパイルできる
    //出力結果"Empty@2a139a55"
    //なぜフィールドもメソッドも未定義のクラスのtoString()を呼び出せるのか？
    //※暗黙の継承　あるクラスを定義するとき、extendsクラスで親クラスを指定しなければ、java.lang.Objectを親クラスとして継承したと見なされる
  }
}