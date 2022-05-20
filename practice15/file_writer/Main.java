// 15-2ファイルへ文字を書き込む
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String filename = "c:\\test.txt"; //ファイルを開く
    FileWriter fw = new FileWriter(filename);
    fw.write('そ'); // 最初の1文字を書く
    fw.write('れ'); // 次の1文字を書く
    fw.close();
  }
}