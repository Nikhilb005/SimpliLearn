import java.util.Scanner;

public class ArithmaticCalculator {
  public static void main(String[] args) {

    char operator;
    double result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, /");
    operator = input.next().charAt(0);
    System.out.println("Enter first number");
    int number1 =  input.nextInt();
    System.out.println("Enter second number");
    int number2 = input.nextInt();

    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}