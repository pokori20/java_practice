//点数管理プログラム
public class List41 {
  public static void main (String[] args) {
    int sansu = 20;
    int kokugo = 30;
    int rika = 40;
    int eigo = 50;
    int syakai = 80;
    //合計点
    int sum = sansu + kokugo + rika + syakai + eigo;
    //平均点の算出
    int avg = sum / 5;
    System.out.println("合計点" + sum);
    System.out.println("平均点" + avg);
  }
}