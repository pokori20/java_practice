//13-1 日付を扱う
import java.util.Date; //Dateメソッドを用いる場合に宣言しておく。
public class Main {
  public static void main(String[] args) {
    // long start = System.currentTimeMilles()
    // //ここで何らかの時間がかかる処理を行う。
    // long end = System.out.println("処理に掛かった時間は・・・" + (end - start) + "ミリ秒でした");
    //Javaでは日時を扱う方は複数あり一つ目が上記のlongである。このlong型はコンピューターにとって扱いやすいが、日付以外の数値の格納にも用いられるため代わりに一目で型が分かるDate型が用いられる。
    Date now = new Date(); //            現在の日時を取得
    System.out.println(now); //　　　　　実行結果　Mon May 09 14:46:10 UTC 2022
    System.out.println(now.getTime()); //実行結果　1652107570955
    Date past = new Date(1316622225935L);//　結果　Wed Sep 21 16:23:45 UTC 2011
    System.out.println(past);
  }
}