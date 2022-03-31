//pacckage文より下かつソースコードの先頭にimport分を入れることで8行目でエラーが発生しない。
import calcapp.CalcLogic;
//計算機プログラム　メソッドの分割
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    //他のファイルのメソッドを呼び出す場合は　呼び出し先class名.method();
    int total = CalcLogic.tasu(a, b);
    int deleta = calcapp.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "引くと" + deleta);
  }
}
// java -verbose:class Calcと入力することで自分が作成したクラスに連携して動くクラスを確認できる
//このようにJavaに標準搭載されているクラスをAPI(Apprication Programing Interface)と総称する