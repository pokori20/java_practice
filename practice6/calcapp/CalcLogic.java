// パッケージ宣言を行うことで呼び出し元が　ファイル名(パッケージ).クラス名でimportできる
package calcapp;
public class CalcLogic {
  public static int tasu(int a , int b) {
    return (a + b);    
  }
  public static int hiku(int a, int b) {
    return (a - b);
  }
}