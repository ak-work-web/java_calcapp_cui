import java.util.Scanner;

public class Calc {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Java版電卓アプリです！");

  while (true) {
   // 1つ目の数字入力
   System.out.println("1つ目の数字を入力してください：");
   String input1 = scanner.nextLine();

   // 終了コマンド
   if (input1.equals("q"))
    break;

   // 数字チェック
   double num1;
   try {
    num1 = Double.parseDouble(input1);
   } catch (NumberFormatException e) {
    System.out.println("エラー：有効な数字を入力してください。");
    continue;
   }

   // 演算子入力
   String operator;
   while (true) {
    System.out.print("演算子（+,-,*,/）を入力してください：");
    operator = scanner.nextLine();
    if (operator.equals("q")) {
     break;
    }
    if (operator.equals("+") || operator.equals("-") ||
      operator.equals("*") || operator.equals("/")) {
     break;
    }
    System.out.print("正しい演算子を入力してください。");
   }
   // 終了コマンド
   if (operator.equals("q")) {
    break;
   }

   // 2つ目の数字入力
   System.out.println("2つ目の数字を入力してください：");
   String input2 = scanner.nextLine();

   // 終了コマンド
   if (input2.equals("q"))
    break;

   // 数字チェック
   double num2;
   try {
    num2 = Double.parseDouble(input2);
   } catch (NumberFormatException e) {
    System.out.println("エラー：有効な数字を入力してください。");
    continue;
   }

   double result = 0;
   if (operator.equals("+")) {
    result = num1 + num2;
   } else if (operator.equals("-")) {
    result = num1 - num2;
   } else if (operator.equals("*")) {
    result = num1 * num2;
   } else if (operator.equals("/")) {
    if (num2 == 0) {
     System.out.print("エラー：0で割ることはできません。");
     continue; // ループ最初に戻る
    }
    result = num1 / num2;
   } else {

   }
   // System.out.println("計算結果：" + (num1 + num2) + "です。");
   System.out.println("計算結果：" + result + "です。");
  }
  // System.out.println("計算結果：" + result + "です。");
  System.out.println("電卓アプリを終了します。ありがとうございました。");
  scanner.close();

 }

}