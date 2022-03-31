public class Sort {
  public static void main(String[] args) {
    int[] heights = { 172, 149, 152, 191, 155};
    //javaのutilityで配列を並べ替えるメソッド
    java.util.Arrays.sort(heights);
    for (int h : heights) {
      System.out.println(h);
    }
  }
}
//結果　149 152 155 172 191