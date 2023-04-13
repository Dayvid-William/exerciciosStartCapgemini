package Poo.ExerciciosOO;

public class Elevador {
  private int totalDeAndares = 30;
  private int andarAtual = 0;
  private int capacidade = 10;
  private int qtdPessoas = 0;

  public Elevador(int andarAtual, int totalDeAndares, int capacidade, int qtdPessoas){
    this.setAndarAtual(andarAtual);
    this.setCapacidade(capacidade);
    this.setQtdPessoas(qtdPessoas);
    this.setTotalDeAndares(totalDeAndares);
  }

  public String Inicializar (int capacidade, int totalDeAndares){
    this.setCapacidade(capacidade);
    this.setTotalDeAndares(totalDeAndares);
    return null;
  }

  public int Entra() {
    if (qtdPessoas < capacidade) {
      qtdPessoas++;
    }else {
      System.out.println("O elevador está cheio !");
    }

    return qtdPessoas;
  }

  public int Sair(){
    if(qtdPessoas > 0) {
      qtdPessoas--;
    }else {
      System.out.println("O elevador está vazio !");
    }

    return qtdPessoas;
  }

  public int Sobe(){
    if (andarAtual < totalDeAndares) {
      andarAtual++;
    }else {
      System.out.println("Você está no maior andar !");
    }

    return andarAtual;
  }

  public int Desce(){
    if(andarAtual == 0) {
      System.out.println("Você está no terreo !");
    } else if (andarAtual >= 0) {
      andarAtual--;
    } else {
      System.out.println("Você está nop terreo não e possivel descer mais");
    }

    return andarAtual;
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getTotalDeAndares() {
    return totalDeAndares;
  }

  public void setTotalDeAndares(int totalDeAndares) {
    this.totalDeAndares = totalDeAndares;
  }

  public int getQtdPessoas() {
    return qtdPessoas;
  }

  public void setQtdPessoas(int qtdPessoas) {
    this.qtdPessoas = qtdPessoas;
  }
}
