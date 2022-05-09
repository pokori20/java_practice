import java.util.Calendar;
import java.util.Date;
public class Main {
  public static void main(String[] args) {
    // 現在の年を表示する
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
    // 指定した日のDate型の値を得る
    c.set(2010,8,22,1,23,45);
    c.set(Calendar.YEAR, 2011); //年だけを2011に変更
    Date past = c.getTime();
    //6つのint値からDateインスタンスを生成する
    // Calendar c = Calendar.getInstance();
    // c.set(年,月,日,時,分,秒); または c.set(Calendar.~, 値);
    // Date d = c.getTime();
    // ~にはYEAR,MONTHなどを指定する
  }
}