public class Loop {
  public static void main (String[] args) {
    //doorCloseがtrueの場合、プログラムがループする
  boolean doorClose = true;
  //ドアが閉まっている間は
  while (doorClose == true) {
    System.out.println("ノックする");
    System.out.println("1分待つ");
    }
  }
}