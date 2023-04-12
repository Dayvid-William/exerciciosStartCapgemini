package Poo.ExerciciosOO;

import java.util.Date;

public class Pessoa {
  private String nome;
  private float altura;
  private int anoDeNascimento;

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoDeNascimento() {
    return anoDeNascimento;
  }

  public void setAnoDeNascimento(int anoDeNascimento) {
    this.anoDeNascimento = anoDeNascimento;
  }

  public int calcularIdade() {
    int idade = 2023 - getAnoDeNascimento();
    return idade;
  }
}
