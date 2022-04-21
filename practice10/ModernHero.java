//11-3 継承を用いてModernHeroクラスを作成する
public class ModernHero extends Hero { // 2行目のextendsがキモ
  private boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
    //extendsという修飾子を用いることで、class ModernHero extends Hero という宣言は基本的にHeroクラスを継承しながらModernHero クラスを定義することができます。
    //そのため、Heroと同じメンバの定義は省略し、違いだけを記述するという意味になります
  }
}