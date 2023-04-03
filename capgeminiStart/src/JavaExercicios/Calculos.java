package JavaExercicios;

import java.util.Scanner;

public class Calculos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o primeiro numero: ");
    int num1 = scan.nextInt();
    System.out.println("Informe o segundo numero: ");
    int num2 = scan.nextInt();

    System.out.println("Soma: " + (num1 + num2));
    System.out.println("Subtração: " + (num1 - num2));
    System.out.println("Divisão: " + (num1 / num2));
    System.out.println("Multiplecação: " + (num1 * num2));
  }
}
