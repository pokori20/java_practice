//16-1 ファイルから文字を読み込む方法
//FileReaderを用いれば、ファイルから1文字ずつ読み込むことができます。
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String filename = "c:\\test.txt"; // 読み込むtxtを指定
    FileReader fr = new FileReader(filename); // ファイルを開く
    char c1 = (char) fr.read(); //最初の1文字を読み込む
    char c2 = (char) fr.read(); //次の1文字を読み込む
    fr.close(); //ファイルを閉じる
  }
}