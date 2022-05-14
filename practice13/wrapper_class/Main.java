// 13-12 基本データ型とラッパークラスの相互互換
public class Main {
  public static void main(String[] args) {
    int i1 = 15;
    Integer i2 = Integer.valueOf(i1); //int→Integer変換
    int i3 = i2.intValue(); // Integer　→　int変換
  }
}
// 通常Integer型のようなラッパークラスを使う必要性感じられないかもしれないが、Javaには「基本データ型を利用できない API」がいくつか存在する。