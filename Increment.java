// class名　ここではIncrement ファイル名=クラス名にすること　原則大文字
public class Increment {
  // {...}はブロックと呼び、外側はクラスブロック　内側はメソッドブロック
  public static void main(String[]args) {
    int a;
    a = 100;
    a++; //aの内容が1増える
    System.out.println(a); //aを出力する
    // 1. javac クラス名.java　⇒　javaファイルをコンパイルする
    // 2. java クラス名　でプログラムを実行
  }
}