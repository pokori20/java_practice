// 15-3 Webページを取得する
import java.io.InputStream;
import java.net.URL;
public class Main {
  public static void main(String[] args) throws Exception {
    URL u = new URL("http://www.impressjapan.jp/");
    InputStream is = u.openStream(); // ネットへ接続
    int i = is.read();
    while (i != -1) { //ページの終わりまで繰り返す
      char c = (char) i;
      System.out.print(c); //読んだ内容を画面に表示
      i = is.read();
    }
  }
}
//実行結果
// <!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
// <html><head>
// <title>301 Moved Permanently</title>
// </head><body>
// <h1>Moved Permanently</h1>
// <p>The document has moved <a href="https://book.impress.co.jp/">here</a>.</p>
// </body></html>