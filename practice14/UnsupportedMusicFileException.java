// 14-6 オリジナル例外を定義する
public class UnsupportedMusicFileException extends Exception {
  public UnsupportedMusicFileException(String msg) {
    super(msg);
  }
}