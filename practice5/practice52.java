public class practice52 {
  public static void methodA() {
    System.out.println("methodA");
    //methodB呼び出し
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  //methodAの呼び出し
  public static void main(String[] args) {
    methodA();
  }
}
//上からmethodA methodBの順番だが、methodAがmainのため実行順はmethodA methodBの順番で実行される