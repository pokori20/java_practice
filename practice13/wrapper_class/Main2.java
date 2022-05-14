// 13-13 AutoBoxingとAutoUnBoxing
//ラッパークラス型と基本データ型との間で代入を行う式を記述すると、自動的にvalueOf()や~valu()による型変換が行われる。
public class Main2 {
  public static void main(String[] args) {
    int i1 = 15;
    Integer i2 = i1; //int→Integer自動変換
    int i3 = i2; //Integer→int自動変換
    System.out.println(i2);
  }
}