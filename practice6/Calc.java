//計算機プログラム　メソッドの分割
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    //他のファイルのメソッドを呼び出す場合は　呼び出し先class名.method();
    int total = CalcLogic.tasu(a, b);
    int deleta = CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "引くと" + deleta);
  }
}