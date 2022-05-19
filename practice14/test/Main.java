// 15-1 String型変数sを宣言し、nullを代入する。 s.length()の内容を表示しようとする
//15-2 15-1で作成したコードを修正し、try-catch文を用いて例外処理してください。
// 「NullPointerException　例外をcatchしました」と表示する
//　「ー－スタックトレース（ここから）ー－」と表示する。
//　「ー－スタックトレース（ここまで）ー－」と表示する。
public class Main {
  public static void main(String[] args) {
    try {
    String s = null;
    System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました。");
      System.out.println("--スタックトレース(ここから)--");
      e.printStackTrace();
      System.out.println("--スタックトレース(ここまで)--");
    }
  }
}