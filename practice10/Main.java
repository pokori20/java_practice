//11-4 SuperHeroクラスがインスタンス化されるときに、JVMが省略されているけれども、SuperHeroクラスはHeroクラスに含まれるrun()、attack()、hp、nameも持っていると判断します。
public class Main {
  public static void main(String args) {
    //11-6
    Hero h = new Hero();
    h.run();
    ModernHero sh = new ModernHero();
    mh.run();
  }
}