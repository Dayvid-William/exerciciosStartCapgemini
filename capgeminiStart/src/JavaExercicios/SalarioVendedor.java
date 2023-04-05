package JavaExercicios;

import java.util.Scanner;

public class SalarioVendedor {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Float salarioFixo;
    Float vendas;
    String vendedor;
    Float salarioFinal;
    Float comissao = 0.15f;

    System.out.println("Informe o nome do vendedor : ");
    vendedor = scan.next();
    System.out.println("Informe o salário fixo: ");
    salarioFixo = scan.nextFloat();
    System.out.println("Informe o total em vendas: ");
    vendas = scan.nextFloat();

    salarioFinal = salarioFixo + (vendas * comissao);

    System.out.println("O Vendedor " + vendedor + " tem um salário fixo de " + salarioFixo + " e recebeu um total com comissão de " + salarioFinal);
  }
}
