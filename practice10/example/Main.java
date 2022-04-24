public class Main {
  public static void main(String[] args) {
    SuperHero sh = new SuperHero();
    //11-10 一見するとSuperHeroクラスの"SuperHeroのコンストラクタが動作"が表示されると思うが、
    //java Main を行うと"SuperHeroのコンストラクタが動作"だけでなく、"Heroのコンストラクタが動作"も呼び出される。なぜか？
    //A すべてのコンストラクタは、その先頭で必ず内部インスタンス部のコンストラクタを呼び出さなければならない。
    //同じクラスの別のコンストラクタを呼び出すためのthis()に似たsuper()という記述で親クラスのコンストラクタを呼び出すことができる。
  }
}