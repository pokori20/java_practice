public class test2 {
  public static void main(String[] args) {
    // String title = "例題タイトル";
    String address = "xxxyyy@mail";
    String text = "テスト2本文";
    email(address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名" + title);
    System.out.println("本文" + text);
  }
  // test5-3 オーバーロード(同盟メソッド)引数の個数違い　
    public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名 : 無題");
    System.out.println("本文 :" + text);
  }
}