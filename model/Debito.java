package view;

import java.util.*;

/**
 * Essa classe representa uma transação de débito.
 */
public class Debito {

  Scanner teclado = new Scanner(System.in);

    private int id;
    private double valor;
    private Date dtPag;
    Pagar pagar;

    private static ContaMovimento contaMovimento = new ContaMovimento();

  /**
   * Construtor padrão para a classe Debito.
   */
  public Debito() {
  }

  /**
   * Construtor para a classe Debito.
   * @param id O ID da transação de débito.
   * @param valor O valor da transação de débito.
   * @param dtPag A data da transação de débito.
   */
  public Debito(int id, double valor, Date dtPag) {
    this.id = id;
    this.valor = valor;
    this.dtPag = dtPag;
  }

  /**
   * Esse método é usado para obter (get) o ID da transação de débito.
   * @return O ID da transação de débito.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) o ID da transação de débito.
   * @param id O ID da transação de débito.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o valor da transação de débito.
   * @return O valor da transação de débito.
   */
  public double getValor() {
    return valor;
  }

  /**
   * Esse método é usado para definir(set) o valor da transação de débito.
   * @param valor O valor da transação de débito.
   */
  public void setValor(double valor) {
    this.valor = valor;
  }

  /**
   * Esse método é usado para obter (get) a data da transação de débito.
   * @return A data da transação de débito.
   */
  public Date getDtPag() {
    return dtPag;
  }

  /**
   * Esse método é usado para definir (set) a data da transação de débito.
   * @param dtPag A data da transação de débito.
   */
  public void setDtPag(Date dtPag) {
    this.dtPag = dtPag;
  }

  /**
   * Esse método é usado para registrar uma transação de débito.
   * @param pagar Uma instância da classe Pagar.
   */
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


    }

  /**
   * Esse método é usado para obter uma representação em string da transação de débito.
   * @return Uma representação em string da transação de débito.
   */
  public String toString(){
    return "Título relacionado: " + pagar + "\n Valor Pago: R$" + valor + "\n Data do Pag: " + dtPag;
  }

  /**
   * Esse método é usado para obter a movimentação da conta.
   * @return Uma instância da classe ContaMovimento.
   */
  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }
}



