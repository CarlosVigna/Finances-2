package view;

import java.util.*;


public class Credito {

  Scanner teclado = new Scanner(System.in);

  private int id;
  private double valor;
  private Date dtPag;
  Receber receber;
  private double valorReceber;

  private static ContaMovimento contaMovimento = new ContaMovimento();

  public Credito() {
  }

  public Credito(int id, double valor, Date dtPag) {
    this.id = id;
    this.valor = valor;
    this.dtPag = dtPag;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Date getDtPag() {
    return dtPag;
  }

  public void setDtPag(Date dtPag) {
    this.dtPag = dtPag;
  }

  public void cadastrar(Receber receber) {
    this.receber = receber;
    this.valorReceber = receber.getValor();
    teclado.nextLine();
    System.out.println("Informe o ID do Recebimento: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe a data do Recebimento: ");
    dtPag = java.sql.Date.valueOf(teclado.nextLine());
    System.out.println("Informe o Valor Recebido: ");
    valor = teclado.nextDouble();
    teclado.nextLine();

    contaMovimento.adicionarCredito(valor);

  }
  public String toString(){
    return "Título relacionado: " + receber + "\n Valor Recebido: R$" + valor + "\n Data do Recebimento: " + dtPag;
  }

  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }
}



