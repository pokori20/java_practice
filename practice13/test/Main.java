// 13章テスト
// 13-1 main()メソッドのみを持つクラスMainを定義し、以下の手順を参考にして「現在の100日後の日付」を「西暦2011年09月24日」という形式で表示するプログラムを作成してください。
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {
  public static void main(String[] args) {
    //1.現在の日時をDate型で取得します。
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    //2.取得した日時情報をCalendarにセットします。
    c.setTime(now);
    //3.Calendarから「日」にセットします。
    int day = c.get(Calendar.DAY_OF_MONTH);
    //4.取得した値に100を足した値をCalendarの「日」にセットします。
    day = day + 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    //5.Calendarの日付情報をDate型に変換します。
    Date d = c.getTime();
    //6.SimpleDateFormatを用いて、Dateインスタンスの内容を表示します。
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    String s = f.format(d);
    System.out.println(f.format(d));
  }
}