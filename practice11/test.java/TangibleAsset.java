//問題１　有形資産(TangibleAsset)という名前の抽象クラスを作成する。また、BookとComputerは、その親クラスを用いた形に修正する。
public abstract class TangibleAsset {
    private String name;
  private int price;
  private String color;
  //コンストラクタ
  public Computer(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }
  //getterメソッド
  public String getName() { return this.name; }
  public int getColor() { return this.price; }
  public String getColor() { return this.color; }
}