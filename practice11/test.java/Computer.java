public class Computer extends TangibleAsset {
  // private String name;
  // private int price;
  // private String color;
  private String makerName;
  //コンストラクタ
  public Computer(String name, int price, String color, String makerName) {
    //親インスタンスのコンストラクを呼び出す
    super(name, price, color);
    // this.name = name;
    // this.price = price;
    // this.color = color;
    this.makerName = makerName;
  }
  //getterメソッド
  // public String getName() { return this.name; }
  // public int getColor() { return this.price; }
  // public String getColor() { return this.color; }
  public String getMakerName() { return this.makerName; }
}