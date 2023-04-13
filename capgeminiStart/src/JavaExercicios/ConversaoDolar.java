package JavaExercicios;

import java.security.KeyRep.Type;
import java.util.Scanner;

public class ConversaoDolar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double quantidadeDeDolar;
    double valorCotacao;
    double totalEmReais;

    System.out.println("Informe a cotação do dolar: ");
    valorCotacao = scan.nextDouble();
    
    System.out.println("Infome a quantidade de dolar: ");
    quantidadeDeDolar = scan.nextDouble();
    
    totalEmReais = quantidadeDeDolar * valorCotacao;
    System.out.println("total convertido: R$" + totalEmReais);
  }
}
