public class Increment2 {
  public static void main(String[]args) {
    int a = 10;
    int b = 10;
    a = ++a + 50;
    b = b++ + 50;
    System.out.println(a); //61
    System.out.println(b); //60 
    //インクリメント・デクリメント演算子がオペランドの前にあると増えたり減ったりするタイミングが
    //異なりバグの原因になるので特別な理由がない限り単独で例:　a++ a+=1のように使う。
    
    // 1. javac クラス名.java　⇒　javaファイルをコンパイルする
    // 2. java クラス名　でプログラムを実行
  }
}