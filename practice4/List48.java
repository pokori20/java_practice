//二次元配列
public class List48 {
  public static void main(String[] args) {
    //[2]行[3]列の配列
    int[][] scores = new int[2][3];
    scores[0][0] = 40;
    scores[0][1] = 50;
    scores[0][2] = 60;
    scores[1][0] = 80;
    scores[1][1] = 60;
    scores[1][2] = 70;
    //[1]行[1]列の要素の値を出力
    System.out.println(scores[1][1]);
  }
}