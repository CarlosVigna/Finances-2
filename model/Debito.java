package view;

import java.util.*;

public class Debito {

  Scanner teclado = new Scanner(System.in);

    private int id;
    private double valor;
    private Date dtPag;
    Pagar pagar;

    private static ContaMovimento contaMovimento = new ContaMovimento();

    public Debito() {
    }

    public Debito(int id, double valor, Date dtPag) {
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

    public void cadastrar(Pagar pagar) {
      this.pagar = pagar;
      teclado.nextLine();
      System.out.println("Informe o ID do valor à debitar: ");
      id = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Informe a data do débito: ");
      dtPag = java.sql.Date.valueOf(teclado.nextLine());
      System.out.println("Informe o Valor à debitar: ");
      valor = teclado.nextDouble();
      teclado.nextLine();

      contaMovimento.adicionarDebito(valor);

    }

  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }
}



