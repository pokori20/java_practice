//対策方法
public class Hero extends Character {
  public void attack(Matango m) { //Characterのattackメソッドの中身空にしてオーバライドする。
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージを与えた！");
    m.hp -= 10;
    //一見悪くないと思えるが、詳細を未定のメソッドが存在するとオーバライドのし忘れや本当に何もしたくないメソッドなのかの区別がつかないという心配事がある
  }
}