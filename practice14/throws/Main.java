// スロー宣言による例外電波の許可
アクセス修飾子 戻り値 メソッド名(引数リスト) throws 例外クラス1, 例外クラス2 {
  メソッドの処理内容
}
public static void subsub() thwos IOException {
  //IOExceptionが発生する可能性があるが、
  //try-catch文がなくてみOK
  FileWriter fw = new FileWriter("data.txt");
}
このメソッドの中ではFileWriterをインスタンス化しており、チェック例外IOExceptionが発生する可能性があります。
しかし、この例のようにスロー宣言を行っていればtry-catch文がなくてもコンパイルエラーにはならない