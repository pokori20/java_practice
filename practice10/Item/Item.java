public class Item {
  private String name;
  private int price;
  public Item(String name) { //引数が1つのコンストラクタ
    this.name = name;
    this.price = 0;
  }
  public Item(String name, int price) { //引数が2つのコンストラクタ
    this.name = name;
    this.price = price;
  }
}