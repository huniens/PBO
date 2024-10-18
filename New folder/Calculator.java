import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

  public static void main(String[] args) {

    System.out.println("======== Simple Calculator ========");
    //variabel
    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter the first number");
    number1 = input.nextDouble();

    System.out.println("Enter the second number");
    number2 = input.nextDouble();

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
        System.out.println("The operator is invalid!");
        break;
    }

    input.close();
  }
}