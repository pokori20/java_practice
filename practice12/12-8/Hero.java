//12-8 同一視してザックリとした引数を受け取る。
public class Hero extends Character {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージを与えた！");
    m.hp -= 10;
  }
  public void attack(Goblin g) {
    System.out.println(this.name + "の攻撃!");
    System.out.println("敵に10ポイントのダメージを与えた！");
    g.hp -= 10;
  }
  //　以前までは引数が違うだけにも関わらず、おなじメソッドを繰り返していた。しかし、以下のように書けば重複したコードを減らすことができる。
  public class Hero extends Character {
    public void attack(Monster m) { // 曖昧な引数MOnsterを渡す。
      System.out.println(this.name + "の攻撃!");
      System.out.println("敵に10ポイントのダメージを与えた！");
      m.hp -= 10;
    }
    //こうすれば異なるインスタンスを引数で同一視して受け取る。
  }
}