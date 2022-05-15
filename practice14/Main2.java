//15-2 try-catch文でException系列外の発生に備える
import java.io.*;
public class Main2 {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt"); // FileWriterのコンストラクタは、IOExceptionを発生させる可能性があります。
    } catch (IOException e) {
      System.out.println("エラーが発生しました。"); //例外的状況に備えて記述された代替処理
    }
  }
}
//Exception 系列外は、例外発生時の対策が用意されているかをコンパイル時点でチェックされるため、チェック例外(checked exception)とも呼ばれます