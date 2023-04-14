package JavaExercicios;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
      int cont = 0;
      double media = 0;
      double x;
      double total = 0.0;

      //TODO: Implemente as condições adequadas para obter a quantidade 
      //de valores positivos e a média dos valores positivos:
      for (int i = 0; i < 6; i++) {
           x = leitor.nextDouble();
           if (x > 0) {
             cont++;
             total = x + total;
          }
           }
         
         
         media = total / cont;
         System.out.println(total);
         System.out.println(cont + " valores positivos");
         System.out.println(String.format("%.1f", media));
    }
  }
}
