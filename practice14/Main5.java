//14-5 例外インスタンスを自分で投げる
// 監視中のJVMに例外的状況をほうこくすることを「例外を投げる」と表現し、例外を投げられるとJVMはそれを検知して即座に
//catchブロックの実行や伝播に処理を移します。
public class Main5 {
  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(-128); //誤った値のセットを試みる
  }
}
//例外発生