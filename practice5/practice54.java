//引数を複数渡す
public class practice54 {
  public static void main(String[] args) {
    add(100, 50);
    add(200, 60);
  }
  //値を受け取るメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}
//引数の渡し方
// メソッド名()
//メソッド名(値)
//メソッド名(値, 値, ...)