public class Conditional {
  public static void main (String[] args){
    boolean tenki = true;
    if (tenki == true) { //もし天気が晴れならば
      System.out.println("選択をします");
      System.out.println("散歩に行きます");
    } else { //elseの前に()を閉じる elseの後の()は1行しかない場合は省略可能だがブロックの波カッコ省略は非推奨
    System.out.println("DVDを見ます");
    }
  }
}