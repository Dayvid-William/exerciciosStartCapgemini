package JavaExercicios;

import java.util.Scanner;

public class CelsiusEmFahrenheit {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int c;
    int f;

    System.out.println("informe a temperatura em graus Celsius: ");
    c = scan.nextInt();

    f = (9*c+160)/5;

    System.out.println("Temperatura em hahrenheit: " + f);
  }
}
