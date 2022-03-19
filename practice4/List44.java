public class List44 {
  public static void main(String[] args) {
    //xが初期化されていないのでコンパイルエラーになる
    // int x;
    // System.out.println(x);
    int[] score = new int[5];
    //配列の要素score[0]は自動的に初期化されるためコンパイルエラーは起きない
    System.out.println(score[0]);
  }
}