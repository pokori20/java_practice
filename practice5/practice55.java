//戻り値の使い方
public class practice55 {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(add(add(10, 20),add(30, 40)));
  }
}
//最初にadd(10, 20)とadd(30, 40)が実行され(30, 70)が戻り値として返る
//その後add(30, 70)が実行されて100が出力される