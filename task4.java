//Реализовать простой калькулятор

import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class task4 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите через пробел два числа: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nПроизведите операцию (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Неверный ввод оператора");
            return;
      }
      String time = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
            time = time + ", Тип операции: " + Double.toString(op) + ", Результат: " + Double.toString(ans) + "\n";
            FileWriter log = new FileWriter("log4.txt", true);
            log.write(time);
            log.flush();
            log.close();

      System.out.print("\nРезультат операции:\n");
      System.out.printf( num1 + " " + op + " " + num2 + " = " + ans);
   }
}