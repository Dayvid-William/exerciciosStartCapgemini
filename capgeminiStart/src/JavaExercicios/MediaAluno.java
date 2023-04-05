package JavaExercicios;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class MediaAluno {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Float media;
    Float nota1;
    Float nota2;
    Float nota3;
    String aluno;


    System.out.println("Informe o nome do aluno: ");
    aluno = scan.next();
    System.out.println("Digite a primeira nota: ");
    nota1 = scan.nextFloat();
    System.out.println("Digite a segunda nota: ");
    nota2 = scan.nextFloat();
    System.out.println("Digite a terceira nota: ");
    nota3 = scan.nextFloat();

    media = (nota1 + nota2 + nota3) / 3;
    System.out.println("Média do aluno " + aluno + " é: " + media); 
  }
}
