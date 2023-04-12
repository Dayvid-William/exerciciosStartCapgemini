package Poo.ExerciciosOO;

public class Main {
  public static void main(String[] args) {
    Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);
    System.out.println("valor total = " + inv.getInvoiceAmount());

    Pessoa pessoa = new Pessoa("dayvid", "29/03/1998", 1.74f);
    System.out.println("O nome da pessoa é : " + pessoa.getNome() + " nascida em: " + pessoa.getDataDeNascimento() + " altura de: " + pessoa.getAltura());
  }
}
