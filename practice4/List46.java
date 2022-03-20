//拡張for文
public class List46 {
  public static void main(String[] args) {
    int [] score = { 20, 30, 40, 50, 80 };
    //ループが1周するたびに次の要素がvalueに入る　このように書いた方がループ変数を用いずに書けてスッキリする
    //for(要素の型　任意の変数 : 配列変数名 ){ }
    for(int value : score) {
      System.out.println(value);
    }
  }
}