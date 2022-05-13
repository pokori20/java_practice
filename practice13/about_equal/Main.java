//13-10  等値と等価の違い
//Objectクラスで定義されているメソッドの中でも、toString()と並んで有名なのがequals()メソッドです。
//equals()メソッドは、2つのインスタンスが「同じ内容であるか」を判定するため、以下のように用いられます。
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    }else{
      System.out.println("違う内容です");
    }
  }
}
// 3章で文字列の比較はequals()を用いるとしたが"equals"と"=="はどのような違いがあるか？
// 前者の比較は等値(equality)であるか、後者は等価(equivalence)であるかを判定するためのものです。
//等値の場合は「完全に同一の存在」つまり同じ番地を指していること　一方等価は指している2つのものが「同じ内容」であること(同じアドレスを指していなくてもよい)