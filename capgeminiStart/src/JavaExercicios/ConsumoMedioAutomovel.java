package JavaExercicios;

import java.util.Scanner;

public class ConsumoMedioAutomovel {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    float consumoMedio;

    System.out.println("Informe o KM percorrido: ");
    Float kmPercorrido  = scan.nextFloat();

    System.out.println("Informe o combustivel gasto no percuso: ");
    Float combustivelGasto = scan.nextFloat();

    consumoMedio = kmPercorrido / combustivelGasto;
    System.out.println("Consumo médio foi de: " + consumoMedio + "KM/L");
  }
}
