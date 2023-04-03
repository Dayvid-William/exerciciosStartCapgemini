package JavaExercicios;

import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o primeiro numero: ");
    int num1 = scan.nextInt();
    System.out.println("Informe o segundo numero: ");
    int num2 = scan.nextInt();

    System.out.println("Total: " + (num1 + num2));
  }
}
