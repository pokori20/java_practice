//＊でピラミッドを作る
public class pyramid  {
	public static void main(String[] args) {
	  //外側のfor文が縦の行
    for(int i=0; i<5; i++){
      //内側のfor文でアスタリスクとスペースを表示する
      for(int j=0; j<5-(i+1); j++){
        System.out.print(" ");
      }
      for(int k=0; k<(i+1)*2-1; k++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}