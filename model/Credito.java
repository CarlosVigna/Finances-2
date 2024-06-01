package view;

import java.util.*;

/**
 * Essa classe representa uma transação de crédito.
 */
public class Credito {

  Scanner teclado = new Scanner(System.in);

  private int id;
  private double valor;
  private Date dtPag;
  Receber receber;
  private double valorReceber;

  private static ContaMovimento contaMovimento = new ContaMovimento();

  /**
   * Construtor padrão para a classe Credito.
   */
  public Credito() {
  }

  /**
   * Construtor com parâmetros.
   * @param id O id da transação de crédito.
   * @param valor O valor da transação de crédito.
   * @param dtPag A data da transação de crédito.
   */
  public Credito(int id, double valor, Date dtPag) {
    this.id = id;
    this.valor = valor;
    this.dtPag = dtPag;
  }

  /**
   * Getter para id.
   * @return O id da transação de crédito.
   */
  public int getId() {
    return id;
  }

  /**
   * Setter para id.
   * @param id O novo id da transação de crédito.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Getter para valor.
   * @return O valor da transação de crédito.
   */
  public double getValor() {
    return valor;
  }

  /**
   * Setter para valor.
   * @param valor O novo valor da transação de crédito.
   */
  public void setValor(double valor) {
    this.valor = valor;
  }

  /**
   * Getter para dtPag.
   * @return A data da transação de crédito.
   */
  public Date getDtPag() {
    return dtPag;
  }

  /**
   * Setter para dtPag.
   * @param dtPag A nova data da transação de crédito.
   */
  public void setDtPag(Date dtPag) {
    this.dtPag = dtPag;
  }

  /**
   * Esse método é usado para registrar uma nova transação de crédito.
   * @param receber O objeto Receber associado à transação de crédito.
   */
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

    /**
     * Esse método é usado para imprimir os detalhes da transação de crédito.
     * @return Uma representação em string da transação de crédito.
     */
  }
  public String toString(){
    return "Título relacionado: " + receber + "\n Valor Recebido: R$" + valor + "\n Data do Recebimento: " + dtPag;
  }

  /**
   * getter para contaMovimento.
   * @return O objeto ContaMovimento associado à transação de crédito.
   */
  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }
}