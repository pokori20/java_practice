public class practice53 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("渚");
    hello("朝霞");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
} 