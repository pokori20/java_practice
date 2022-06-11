public class Main {
  public static void main(String[] args) {
    System.out.println("好きな数字を入力してください");
    int i = new java.util.Scanner(System.in).nextInt();
    if (i % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if(i % 3 == 0) {
      System.out.println("Fizz");
    } else if (i % 5 == 0){
      System.out.println("Buzz");
    } else {
      
    }
  }
}