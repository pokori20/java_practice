//11章テスト 1. ある会社では会社の資産として保有するものを管理するプログラムを作ろうとしている。現時点では「本」と「コンピューター」の2つのクラスがある
public class Book extends TangibleAsset {
  private String name;
  private int price;
  private String color;
  private String isbn;
  //コンストラクタ
  public Book(String name, int price, String color, String isbn) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.isbn = isbn;
  }
  //getterメソッド
  public String getName() { return this.name; }
  public int getPrice() { return this.price; }
  public getColor() { return this.color; }
  public getIsbn() { return this.isbn; }
}