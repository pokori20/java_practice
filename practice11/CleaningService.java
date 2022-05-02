//インターフェースのついて
//CreaningServiceでは、シャツとタオル、コートを渡せば洗って返してくれます。
//CreaningServiceインターフェースでは、どのように扱うのか処理を定義されていない抽象メソッドとなる。
public interface CleaningService {
  Shirt washShirt(Shirt s);
  Towl washShirt(Shirt s);
  Coat washCoat(Coat c);
}