//14-1例外処理について
//Javaではいざ例外が発生した時に何も対処されないということはあってはならないはずです。そのため、Javaでは、Exception系の例外が発生しそうな命令を呼び出す場合、
//try-catch分を用いて「例外が発生したときの代替処理」を用意しておかないとコンパイルエラーになります。
//例外処理を用意していない場合
import java.io.*;
public class Main {
  public static void main(String[] args) {
    //FireWriterのコンストラクタは、IOExceptionを発生させる
    //可能性があります。しかし、try-catchでは囲みません
    //（失敗時にどうするか、考えていない）。
    FileWriter fw = new FileWriter("data.txt");
  }
}
//Main.java:11: error: unreported exception IOException; must be caught or declared to be thrown
//     FileWriter fw = new FileWriter("data.txt");
//                     ^
// 1 error　とエラーが表示される