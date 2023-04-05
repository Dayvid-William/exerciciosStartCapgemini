package JavaExercicios;

import java.util.Scanner;

public class NumeroEntre100E200 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um numero para verificar se ele esta entre 100 ou 200: ");
    int numero = scan.nextInt();

    if (numero <= 200 && numero >= 100 ) System.out.println("Sim o numero está entre 100 e 200 !");
    else if (numero > 200) System.out.println("Não, o numero e maior que 200 !");
    else System.out.println("Não, o numero e menor do que 100!");
  }
}
