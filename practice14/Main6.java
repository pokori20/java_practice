// 14-7 オリジナル例外を利用する
//　APIにはIOExceptionやIllegalArgumentExceptionなどの多くの例外クラスが備わっています。それらの既存の例外クラスを使えば、多くのプログラムは問題なく作成できます。
//　しかし、「独自の例外的状況を表す「オリジナル例外クラス」を使いたくなることもあります。下記は音楽プレイヤーソフトを開発しており、対応していないファイルの例外
//　的状況を表すUnsupportedMusicFileExceptionが欲しくなったとします。以下のように既存のクラスを継承してオリジナル例外クラスを作成できます。
public class Main6 {
  public static void main(String[] args) {
    try {
      // 試験的に例外を発生させる
      throw new UnsupportedMusicFileException("未対応のファイルです");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
//出力結果
// UnsupportedMusicFileException: 未対応のファイルです
//         at Main6.main(Main6.java:5)