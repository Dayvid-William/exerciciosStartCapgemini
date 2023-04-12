package Poo.ExerciciosOO;

public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Dayvid");
    pessoa.setAltura(1.74f);
    pessoa.setAnoDeNascimento(1998);

    pessoa.calcularIdade();
  }
}
