//15-4
import java.io.*;
public class Main {
  public static void main(String[] arfgs) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (IOException e) {
      System.out.println("エラーです");
    }
    fw.close(); //try-catch文の後でcloseする
  }
}