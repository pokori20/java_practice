public class Switch {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = 1;
    //1.すべての条件式が左辺と右辺が一致するか比較する式になっている 2.比較する値が整数、文字列、またはchar型の文字の場合に使用できる
    switch (fortune) {
      case 1:
        System.out.println("大吉");
        //ここにbreak;をいれないとcase 2以下も実行される
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("小吉");
        break;
      case 4:
        System.out.println("凶");
        
    }
  }
}