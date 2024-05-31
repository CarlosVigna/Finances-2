package view;

import java.util.*;

/**
 * Esta classe representa uma transação de crédito.
 * Ela fornece métodos para criar e gerenciar transações de crédito.
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
   * Construtor para a classe Crédito.
   * @param id O ID da transação de crédito.
   * @param valor O valor da transação de crédito.
   * @param dtPag A data da transação de crédito.
   */
  public Credito(int id, double valor, Date dtPag) {
    this.id = id;
    this.valor = valor;
    this.dtPag = dtPag;
  }

  /**
   * Esse método é usado para obter (get) o ID da transação de crédito.
   * @return O ID da transação de crédito.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) o ID da transação de crédito.
   * @param id O ID da transação de crédito.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o valor da transação de crédito.
   * @return O valor da transação de crédito.
   */
  public double getValor() {
    return valor;
  }

  /**
   * Esse método é usado para definir (set) o valor da transação de crédito.
   * @param valor O valor da transação de crédito.
   */
  public void setValor(double valor) {
    this.valor = valor;
  }

  /**
   * Esse método é usado para obter (get) a data da transação de crédito.
   * @return A data da transação de crédito.
   */
  public Date getDtPag() {
    return dtPag;
  }

  /**
   * Esse método é usado para definir (set) a data da transação de crédito.
   * @param dtPag A data da transação de crédito.
   */
  public void setDtPag(Date dtPag) {
    this.dtPag = dtPag;
  }

  /**
   * Esse método é usado para registrar uma transação de crédito.
   * @param receber Uma instância da classe Receber.
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

    contaMovimento.adicionarCredito(valor);

  }

  /**
   * Esse método é usado para obter uma representação em string da transação de crédito.
   * @return Uma representação em string da transação de crédito.
   */
  public String toString(){
    return "Título relacionado: " + receber + "\n Valor Recebido: R$" + valor + "\n Data do Recebimento: " + dtPag;
  }

  /**
   * Esse método é usado para obter a movimentação da conta.
   * @return Uma instância da classe ContaMovimento.
   */
  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }
}