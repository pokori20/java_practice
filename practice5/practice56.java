//多重定義文(オーバーロード　引数が異なる場合)
public class practice56 {
  public static int add(int x, int y) {
    return x + y;
  }
  public static double add(double x, double y) {
    return x + y;
  }
  public static String add(String x, String y) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println(add(10, 20));
    System.out.println(add(3.4, 5.9));
    System.out.println(add("Hello", "World"));
  }
}
//本来同じ名前のメソッド(add)を複数定義することはできないが、仮引数の型がint, double, Stringとそれぞれ違うため実引数の型を見てその型に一致するメソッドを呼び出せる