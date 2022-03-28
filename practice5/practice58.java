public class practice58 {
  //int型配列を受け取り、
  //配列内の要素すべてに1を加えるメソッド
  public static void inArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3 };
    inArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}