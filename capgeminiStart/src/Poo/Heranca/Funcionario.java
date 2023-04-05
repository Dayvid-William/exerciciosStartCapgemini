package Poo.Heranca;

import java.util.Date;

public class Funcionario {
  
  private String nome;
  private String cpf;
  private Date dataDeNascimento;
  private Float salario;


  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(Date dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Float getSalario() {
    return salario;
  }

  public void setSalario(Float salario) {
    this.salario = salario;
  }
}
