//配列とfor文
public class List45 {
  public static void main(String[] args) {
    int[] score = { 20, 30, 40, 50, 80 };
    //以下のように変数iの条件式を書くことで配列の要素が増えたときに、いちいち書き換える必要がなくなる
    //for(int i = 0;i<配列変数名.length;i++){ } 配列をループで回す構文
    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }
  }
}