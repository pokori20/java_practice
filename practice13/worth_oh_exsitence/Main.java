//Objectクラスの存在価値
//すべてのクラスがObjectを祖先に持つため、「すべてのクラスis-aObject」ということができる。
//Object型の変数には、どんなインスタンスにも代入できることを以下は示している。
public class Main {
  public static void main(String[] args) {
    Object o1 = new Empty();
    Object o2 = new Hero( );
    Object o3 = "こんにちは";
  }
  //また、以下のリストのように引数としてObject型を用いることで「何型でもいいのでインスタンスを渡せる」メソッドを作ることもできます。
  public void printAnything(Object o) {
    //何型でもいいから、引数を１つ受け取り画面に表示
    System.out.println(o.toString());
  }
}