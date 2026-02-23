import java.util.Scanner;

public class Calc {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Java版電卓アプリです！");

  while (true) {
   // 1つ目の数字入力
   Double num1 = getNumber(scanner, "1つ目の数字を入力してください：");
   if (num1 == null)
    break;

   // 演算子入力
   String operator = getOperator(scanner);
   if (operator.equals("q"))
    break;

   // 2つ目の数字入力
   Double num2 = getNumber(scanner, "2つ目の数字を入力してください：");
   if (num2 == null)
    break;

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
   System.out.println("計算結果：" + result + "です。");
  }
  System.out.println("電卓アプリを終了します。ありがとうございました。");
  scanner.close();

 }

 // 数字入力メソッド
 public static Double getNumber(Scanner scanner, String message) {
  while (true) {
   System.out.println(message);
   String input = scanner.nextLine();

   if (input.equals("q")) {
    return null;
   }

   try {
    return Double.parseDouble(input);
   } catch (NumberFormatException e) {
    System.out.println("エラー：有効な数字を入力してください。");
    continue;
   }

  }
 }

 // 演算子入力メソッド
 public static String getOperator(Scanner scanner) {
  while (true) {
   System.out.print("演算子（+,-,*,/）を入力してください：");
   String operator = scanner.nextLine();

   if (operator.equals("+") || operator.equals("-") ||
     operator.equals("*") || operator.equals("/") || operator.equals("q")) {
    return operator;
   }
   System.out.print("正しい演算子を入力してください。");
  }

 }

}
