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

    BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.1, 5000.0f);
    System.out.println(bomba.getTipoCombustivel() + " " +  bomba.getValorPorLitro() + " " + bomba.getQuantidadeCombustivel());
    bomba.getAlterarValorDoLitro(6);
    System.out.println("quantidade abastecida foi: " + bomba.getAbastecerPorValor(500) + " litros");
    System.out.println("O valor a pagar e R$:" + bomba.getAbastecerPorLitro(5.5));
    bomba.getAlterarCombustivel("Disel");
    System.out.println(bomba.getTipoCombustivel());
    bomba.getAlterarQuantidadeCombustivel(3000.8);
    System.out.println(bomba.getQuantidadeCombustivel());

    Elevador elevador = new Elevador(0, 30, 10, 0);
    System.out.println(elevador.getTotalDeAndares());
    elevador.Inicializar(12, 12);
    System.out.println(elevador.getCapacidade() + " " + elevador.getTotalDeAndares());

    elevador.Inicializar(2, 3);
    elevador.Entra();
    elevador.Entra();
    elevador.Entra();
    System.out.println(elevador.getQtdPessoas());
    
    elevador.Sair();
    elevador.Sair();
    elevador.Sair();
    System.out.println(elevador.getQtdPessoas());

    elevador.Sobe();
    elevador.Sobe();
    elevador.Sobe();
    elevador.Sobe();
    System.out.println(elevador.getAndarAtual());

    elevador.Desce();
    elevador.Desce();
    elevador.Desce();
    elevador.Desce();
    elevador.Desce();
    elevador.Desce();
    System.out.println(elevador.getAndarAtual());


  }
}
