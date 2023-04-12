package Poo.ExerciciosOO;

public class Pessoa {
  
  private String nome;
  private String dataDeNascimento;
  private float altura;

  public Pessoa(String nome, String dataDeNascimento ,float altura){
    this.setAltura(altura);
    this.setDataDeNascimento(dataDeNascimento);
    this.setNome(nome);
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
}
