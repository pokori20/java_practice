// 15-4 java.sqlパッケージを用いてデータベースにSQL文を送る
import java.sql.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Class.forName("org.h2.Driver");
    String dqurl = "jdbc:h2:~/test" //接続先DBを指定
    String sql = "INSERT INTO EMPLOYEES(name) VALUES('iida')";
    Connection conn = DriverManager.getConnection(dqurl); //DBに接続
    conn.createStatement().executeUpdate(sql); // SQLを送信
    conn.close(); // DB接続を閉じる
  }
}