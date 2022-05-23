// 15-6 Android端末用のHelloWorld
//以下はAndroid端末で「Hello Android」と画面に表示するJavaコードです。このリストをコンパイルするにはAndroid用のSDKが必要です。
package my.package;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class HelloAndroid extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView tv = new TextView(this);
    tv.setText("Hello Android");
    setContentView(tv);
  }
}