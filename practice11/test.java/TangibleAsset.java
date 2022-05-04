//問題１　有形資産(TangibleAsset)という名前の抽象クラスを作成する。また、BookとComputerは、その親クラスを用いた形に修正する。
//問題４　有形資産(TangibleAsset)は、資産(Asset)の一種でもあり、形あるもの(Thing)でもある。この定義に合うようにTangibleAssetのソースコードを修正せよ。
public abstract class TangibleAsset extends Asset inplements  Thing { //インターフェースThingを実装
  // private String name;
  // private int price;
  private String color;
  //Thingインターフェース
  private double weight;

  //コンストラクタ
  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    // this.name = name;
    // this.price = price;
    this.color = color;
  }
  //getterメソッド
  // public String getName() { return this.name; }
  // public int getColor() { return this.price; }
  public String getColor() { return this.color; }
  //Thingから継承した2つのメソッドを実装
  public double getWeight() { return this.weight; }
  public void setWeight(double weight){ this.weight = weight; }
}