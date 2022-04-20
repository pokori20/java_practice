//10.7 テスト１ WizardとWandのすべてのフィールドとメソッドについて、カプセル化の定石に従ってアクセス修飾子を追加して下さい。Wizaradクラスにコンパイルエラーが発生しますが、それは構いません。
 public class Wand {
   private String name; //杖の名前
   private double power; //杖の魔力
   public String getName() {
     return this.name;
   }
   public void setName(String name) {
     this.name = name;
   }
   public double getPower() {
     return this.power;
   }
   public void setPower(double power) {
     this.power = power;
   }
 }