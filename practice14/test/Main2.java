//15-3 Integer.parseInt()メソッドを実行し、文字列"三"の変換結果をint型変数iに代入する
//コードを記述してください。その際、paseInt()メソッドがどのような例外を発生させる可能性
//があるかをAPIリファレンスで調べ、正しく例外理由を記述してください。
public class Main2 {
  public static void main(String[] args) {
    try{
      //APIリファレンスから送出例外を調べる
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      System.out.println("例外NumberFormatExceptionをcatchしました");
    }
  }
}