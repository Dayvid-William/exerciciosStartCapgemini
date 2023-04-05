package Poo.Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {
  
  private int totalItensVendidos;
  private Float comissaoPorItem;

  public Vendedor() {
    super();
  }

  public float calcularSalario() {
    return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
  }

   public Float getComissaoPorItem() {
     return comissaoPorItem;
   }

   public void setComissaoPorItem(Float comissaoPorItem) {
     this.comissaoPorItem = comissaoPorItem;
   }

   public int getTotalItensVendidos() {
     return totalItensVendidos;
   }

   public void setTotalItensVendidos(int totalItensVendidos) {
     this.totalItensVendidos = totalItensVendidos;
   }
}