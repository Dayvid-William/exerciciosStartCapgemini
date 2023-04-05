package JavaExercicios;

import java.util.Scanner;

public class DescontoCarros {
  public static void main(String[] args) {
    Scanner leitor =  new Scanner(System.in);

    int anoFabricacao = 0;
    float valorCarro = 0.0f;
    float porcentagemDesconto = 0.0f;
    float valorDesconto = 0.0f;
    float valorPagar = 0.0f;

    char desejaReptir = 's';
    int totalCarrosSemiNovos = 0;
    int totalCarros = 0;

    while(desejaReptir == 's' || desejaReptir == 'S') {

      System.out.println("Digite o ano de fabricação do veiculo: ");
      anoFabricacao = leitor.nextInt();

      System.out.println("Digite o valor do veiculo: ");
      valorCarro = leitor.nextFloat();

      if (anoFabricacao <= 2000){
        porcentagemDesconto = 0.12f;
      }else {
        porcentagemDesconto = 0.07f;
        totalCarrosSemiNovos++;
      }
      totalCarros++;

      valorDesconto = valorCarro * porcentagemDesconto;
      valorPagar = valorCarro - valorDesconto;

      System.out.println("O Valor do desconto foi de: " + valorDesconto);
      System.out.println("O valor que deve ser pago é: " + valorPagar);

      System.out.println("Deseja fazer mais cadastros ? S - Sim / N - Nao");
      desejaReptir = leitor.next().charAt(0);
    }

    System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
    System.out.println("Total de carros: " + totalCarros);
  }
}
