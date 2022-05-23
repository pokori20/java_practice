//15-7 Javaで作るWebアプリケーション　Javaを用いてWebアプリケーションを作成する場合には(Servlet)というクラスを開発します。
//以下はアクセスされたら現在時刻を取得してWebページとして返す簡単なサーブレットのサンプルコードです。
import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    Date d = new Date(); //　現在日付を取得
    Writer w = res.getWriter();
    w.write("<html><body>");
    w.write("Today is " + d.toString()); //現在日付を出力
    w.write("</body></html>");
  }
}