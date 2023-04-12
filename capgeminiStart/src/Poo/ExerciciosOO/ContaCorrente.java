package Poo.ExerciciosOO;

public class ContaCorrente {
  private int numeroConta;
  private String nomeCorrentista;
  private Double saldo = 0.0;

  public ContaCorrente(int numeroConta, String nomeCorrentista, Double saldo){
    this.setNumeroConta(numeroConta);
    this.setNomeCorrentista(nomeCorrentista);
    this.setSaldo(saldo);
  }

  public double getSacar(double valorASacar){
    this.setSaldo(saldo - valorASacar);
    return saldo;
  }

  public double getDepositar(double valorDeDeposito){
    this.setSaldo(saldo + valorDeDeposito);
    return saldo;
  }

  public String getAlterarNome(String novoNome){
    this.setNomeCorrentista(novoNome);
    return nomeCorrentista;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }

  public void setNomeCorrentista(String nomeCorrentista) {
    this.nomeCorrentista = nomeCorrentista;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    if(saldo == null) {
      this.saldo = 0.0;
    }else {
      this.saldo = saldo;
    }
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }
}
