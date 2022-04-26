//10-10 親インスタンス部が作れない状況
//Itemディレクトリ下のItem Weapon Main.javaではエラーが発生する
public class Main {
  public static void main(String[] args) {
    Weapon w = new Weapon(); //1. new Weapon()により、JVMはWeaponインスタンスを生成しようとする。
  }
}