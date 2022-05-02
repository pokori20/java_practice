// 11-15 インターフェースの実装　CreaningService インターフェースが店頭メニューだとすれば、それを
// 継承して次のように記述したKyotoCleaningShopクラスこそが「クリーニング店そのもの」と言える。
// インターフェースを実装してKyotoCleaningShopはCleaningServiceという抽象メソッドを呼び出せる。
public class KyotoCleaningShop implements CleaningService { //インターフェースを実装しクラスを宣言する場合はimplements
  private String ownerName;
  private String address;
  private String phone;
  //シャツを洗う
  public shirt washShirt(Shirt s) {
    //大型機15分
    //業務用30分
    //スチームアイロン5分
    return s;
  }
  // タオルを洗う
  public Towl washTowl(Towl t) {
    
  }
  // コートを洗う
  public Coat washCoat(Coat c) {
    
  }
  //インターフェースの効果
  // １．同じインターフェースをimplementsする複数の子クラスたちに、共通のメソッド群を実装するように強制できる。
  // ２．あるクラスがインターフェースを実装していれば、少なくともそのインスタンスが定めたメソッドは持っていることが保障される。
}