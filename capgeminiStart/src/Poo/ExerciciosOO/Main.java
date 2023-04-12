package Poo.ExerciciosOO;

public class Main {
  public static void main(String[] args) {
    Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);
    System.out.println("valor total = " + inv.getInvoiceAmount());

    Pessoa pessoa = new Pessoa("dayvid", "29/03/1998", 1.74f);
    System.out.println("O nome da pessoa é : " + pessoa.getNome() + " nascida em: " + pessoa.getDataDeNascimento() + " altura de: " + pessoa.getAltura());

    ContaCorrente conta = new ContaCorrente(7225, "Dayvid" , 550.50);
    System.out.println(conta.getSaldo());
    conta.getSacar(50.0);
    System.out.println(conta.getSaldo());
    conta.getDepositar(100);
    System.out.println(conta.getSaldo());
    conta.getAlterarNome("Dayvid William");
    System.out.println(conta.getNomeCorrentista());
  }
}
