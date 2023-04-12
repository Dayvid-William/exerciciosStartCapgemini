package Poo.ExerciciosOO;



public class BombaCombustivel {

  private String tipoCombustivel;
  private double valorPorLitro;
  private double quantidadeCombustivel;

  public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivel){
    this.setTipoCombustivel(tipoCombustivel);
    this.setValorPorLitro(valorPorLitro);
    this.setQuantidadeCombustivel(quantidadeCombustivel);
  }

  public double getAbastecerPorValor(double valor) {
    double quantidadeAbastecida = valor / valorPorLitro;
    return quantidadeAbastecida;
  }

  public double getAlterarValorDoLitro(double novoValor) {
    this.valorPorLitro = novoValor;
    return valorPorLitro;
  }

  public String getAlterarCombustivel(String novoCombustivel) {
    this.tipoCombustivel = novoCombustivel;
    return tipoCombustivel;
  }

  public double getAlterarQuantidadeCombustivel(double novaQuantidade) {
    this.quantidadeCombustivel = novaQuantidade;
    return quantidadeCombustivel;
  }

  public double getAbastecerPorLitro(double litros){
    double valorAPagar = litros * valorPorLitro;
    return valorAPagar;
  }

  public double getQuantidadeCombustivel() {
    return quantidadeCombustivel;
  }

  public void setQuantidadeCombustivel(double quantidadeCombustivel) {
    if (quantidadeCombustivel < 0) {
      this.quantidadeCombustivel = 0;
    } else {
      this.quantidadeCombustivel = quantidadeCombustivel;
    }
  }

  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }

  public double getValorPorLitro() {
    return valorPorLitro;
  }

  public void setValorPorLitro(double valorPorLitro) {
    if( valorPorLitro < 0) {
      this.valorPorLitro = 0;
    }else {
      this.valorPorLitro = valorPorLitro;
    }
  }
}
