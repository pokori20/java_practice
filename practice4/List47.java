public class List47 {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3 };
    int[] b;
    b = a;
    b[0] = 100;
    //出力されるのはaの配列の0の値1ではなく、100
    System.out.println(a[0]);
  }
}