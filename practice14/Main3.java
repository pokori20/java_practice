//14-3 ザックリと例外を補足する
import java.io.*;
public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
      fw.close();
    } catch (Exception e) { //Exceptionの子孫をどれでもキャッチ
      System.out.println("何らかの例外が発生しました");
    }
  }
}
//この書き方だと例外の種類が増えてもcatchブロックを増やさなくていいから楽だが、大雑把すぎてどのような種類の例外が発生しているかは特定できない。